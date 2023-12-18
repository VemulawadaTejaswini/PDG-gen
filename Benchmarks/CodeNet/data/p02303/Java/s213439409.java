import java.util.*;

class Main {
        
        //  for two points x(x0,x1) and y(y0,y1), what is the squared distance? 
        public static Double dist(Double[] x, Double[] y) {     
            return Math.pow(x[0] - y[0], 2) + Math.pow(x[1] - y[1], 2);
       }
        
        // only need to return a value if closest pair is split between left and right halves
        public static ArrayList<ArrayList<Double[]>> splitpair(ArrayList<Double[]> px, ArrayList<Double[]> py, double d) {  
            double xBar = px.get(px.size()/2)[0]; // largest x-coordinate of the left half of px
            ArrayList<Double[]> Sy = new ArrayList<Double[]>(); // Sy will be the set of points 
            //(sorted by Y-coordinate) where the x-coord xi satisfies xBar-d <= xi <= xBar -d
            for (int i = 0; i < py.size(); i++) {
                if (xBar - d <= py.get(i)[0] && py.get(i)[0]<= xBar + d) { //only consider a 'strip' 
                    // around xBar that is 2*d wide
                    Sy.add(py.get(i)); // if exists a pair with dist less than d
                    // it must be in this strip (obvious) 
                }
            }
            ArrayList<ArrayList<Double[]>> bestpair = new ArrayList<ArrayList<Double[]>>(); // the coords of the best pair of points so far
            bestpair = null;
            double bestD = d * d; // the squared distance of the best pair of points
            
            // now iterate through Sy for points that aren't more than 7 apart
            // if a pair exists that is closer than dist d, it must be within 7 of each other
            for (int i = 0; i < Sy.size() - 2; i++) {
                for (int j = 1; j < Math.min(8, Sy.size()-i-1); j++) { // the next 7 points
                    Double[] p = Sy.get(i); Double[] q = Sy.get(i+j);
                    
                    if (dist(p, q) < bestD) {
                        bestpair = convertToForm(p,q);
                        bestD = dist(p, q);
                    }
                }
            }
            
            return bestpair;
        }
   
        public static ArrayList<ArrayList<Double[]>> convertToForm(Double[] x, Double[] y) { 
            //convert 2 points into two pairs of pairs, first sorted by x, other sorted by y (so Px, Py style)
            ArrayList<Double[]> ptsByX = new ArrayList<Double[]>();
            ArrayList<Double[]> pysByY = new ArrayList<Double[]>();
            ptsByX.add(x); ptsByX.add(y); pysByY.add(x); pysByY.add(y);
            // to get sorted by x-coord then sorted by y-coord, first sort by y-coord
            // then sort by x-coord (since Arrays.sort is stable)
            Collections.sort(ptsByX, new Comparator<Double[]>(){
                public int compare(Double[] doubles, Double[] otherDoubles) {
                    return doubles[1].compareTo(otherDoubles[1]); 
                }
            }); 
            Collections.sort(ptsByX, new Comparator<Double[]>(){
                public int compare(Double[] doubles, Double[] otherDoubles) {
                    return doubles[0].compareTo(otherDoubles[0]); 
                }
            }); 
            // sort by y-coord
            Collections.sort(pysByY, new Comparator<Double[]>(){
                public int compare(Double[] doubles, Double[] otherDoubles) {
                    return doubles[0].compareTo(otherDoubles[0]); 
                }
            }); 
            Collections.sort(pysByY, new Comparator<Double[]>(){
                public int compare(Double[] doubles, Double[] otherDoubles) {
                    return doubles[1].compareTo(otherDoubles[1]); 
                }
            }); 
            
            ArrayList<ArrayList<Double[]>> res = new ArrayList<ArrayList<Double[]>>();
            res.add(ptsByX); res.add(pysByY);
            return res;
        }

        public static ArrayList<ArrayList<Double[]>> solve(ArrayList<ArrayList<Double[]>> P) { 
            ArrayList<Double[]> Px = new ArrayList<Double[]>();
            ArrayList<Double[]> Py = new ArrayList<Double[]>();
            Px = P.get(0); Py = P.get(1);            
            // where Px and Py are the points sorted by x and y coordinate respectively
            // this function returns the 2 closest points
            if (Px.size() == 2) {
                return P;
            } else if (Px.size() == 3) {
                Double[] p1 = Px.get(0); Double[] p2 = Px.get(1); Double[] p3 = Px.get(2);
                Double d12 = dist(p1, p2); Double d13 = dist(p1, p3); Double d23 = dist(p2, p3);
                Double minD = Math.min(d23, Math.min(d12, d13));
                if (d12 - Math.pow(10, -8) <= minD && minD <= d12 + Math.pow(10, -8)) {
                    return convertToForm(p1, p2);
                } else if (d13 - Math.pow(10, -8) <= minD && minD <= d13 + Math.pow(10, -8)) {
                    return convertToForm(p1, p3);
                } else if (d23 - Math.pow(10, -8) <= minD && minD <= d23 + Math.pow(10, -8)) {
                    return convertToForm(p2, p3);
                } else {
                    System.out.println("HUNG!");
                    return convertToForm(p2, p3);
                }
            } else {
                // split the left and right halves of all points (by x coord)
                int L = Px.size();
                assert L > 1;
                ArrayList<Double[]> Qx = new ArrayList<Double[]>();
                ArrayList<Double[]> Rx = new ArrayList<Double[]>();
                for (int i = 0; i < L; i++) {
                    if (i < L/2) {
                        Qx.add(Px.get(i));
                    } else {
                        Rx.add(Px.get(i));
                    }
                }
                ArrayList<Double[]> Qy = new ArrayList<Double[]>();
                ArrayList<Double[]> Ry = new ArrayList<Double[]>();
                Double k = Qx.get(Qx.size()-1)[0]; 
                Double l = Qx.get(Qx.size()-1)[1];
                for (int i=0; i < Py.size(); i++) {
                    Double[] pt = Py.get(i);
                    if (pt[0] < k) {
                        Qy.add(pt);
                    } else if (pt[0] == k) {
                        if (pt[1] <= l) {
                            Qy.add(pt);
                        } else {
                           Ry.add(pt);
                        }
                    } else {
                        Ry.add(pt);
                    }
                }
                assert Qy.size() == Qx.size();
                assert Ry.size() == Rx.size();
                assert Qx.size() >= 2;
                
                // now use recursion
                ArrayList<ArrayList<Double[]>> Q = new ArrayList<ArrayList<Double[]>>();
                ArrayList<ArrayList<Double[]>> R = new ArrayList<ArrayList<Double[]>>();
                Q.add(Qx); Q.add(Qy); R.add(Rx); R.add(Ry);
                assert Q.size() >= 2;
                ArrayList<ArrayList<Double[]>> c1 = solve(Q);
                ArrayList<ArrayList<Double[]>> c2 = solve(R);
                Double Dc1 = dist(c1.get(0).get(0), c1.get(0).get(1)); // returns SQUARED distance
                Double Dc2 = dist(c2.get(0).get(0), c2.get(0).get(1)); // returns SQUARED distance
                
                Double D = Math.min(Dc1, Dc2);
                ArrayList<ArrayList<Double[]>> bestpair = new ArrayList<ArrayList<Double[]>>();
                
                if (Dc1 - Math.pow(10, -8) <= D && D <= Dc1 + Math.pow(10, -8)) {
                    bestpair = c1;
                } else if (Dc2 - Math.pow(10, -8) <= D && D <= Dc2 + Math.pow(10, -8)) {
                    bestpair = c2;
                } else {
                    System.out.println("FUCK!");
                }
                        
                ArrayList<ArrayList<Double[]>> c3 = splitpair(Px, Py, Math.pow(D, 0.5));
                
                if (c3 == null) {
                    return bestpair;
                }
                return bestpair;
            }
        }

        public static void main(String[] args) {   
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            
            ArrayList<Double[]> ptsByX = new ArrayList<Double[]>();
            ArrayList<Double[]> ptsByY = new ArrayList<Double[]>();
            for (int i = 0; i < N; i++) {
                Double[] coords = {scan.nextDouble()*1000, scan.nextDouble()*1000};
                ptsByX.add(coords); ptsByY.add(coords);
            }
            scan.close();
            
            // now sort by x coord
            Collections.sort(ptsByX, new Comparator<Double[]>(){
                public int compare(Double[] doubles, Double[] otherDoubles) {
                    return doubles[1].compareTo(otherDoubles[1]); 
                }
            }); 
            Collections.sort(ptsByX, new Comparator<Double[]>(){
                public int compare(Double[] doubles, Double[] otherDoubles) {
                    return doubles[0].compareTo(otherDoubles[0]); 
                }
            }); 
            // sort by y-coord
            Collections.sort(ptsByY, new Comparator<Double[]>(){
                public int compare(Double[] doubles, Double[] otherDoubles) {
                    return doubles[0].compareTo(otherDoubles[0]); 
                }
            }); 
            Collections.sort(ptsByY, new Comparator<Double[]>(){
                public int compare(Double[] doubles, Double[] otherDoubles) {
                    return doubles[1].compareTo(otherDoubles[1]); 
                }
            }); 
            
            ArrayList<ArrayList<Double[]>> P = new ArrayList<ArrayList<Double[]>>();
            P.add(ptsByX); P.add(ptsByY);
            assert P.size() == 2;
            
            ArrayList<ArrayList<Double[]>> res = new ArrayList<ArrayList<Double[]>>();
            res = solve(P);
            
            System.out.println(Math.pow(dist(res.get(0).get(0), res.get(0).get(1)), 0.5)/1000.0);
        }
}