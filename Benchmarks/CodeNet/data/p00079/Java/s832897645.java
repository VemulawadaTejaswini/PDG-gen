import java.util.*;

class Main {

    static Double areaTriangle (double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Math.sqrt( (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) );
        double b = Math.sqrt( (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3) );
        double c = Math.sqrt( (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1) );
        double z = (a + b + c) / 2.0;

        return Math.sqrt( z * (z - a) * (z - b) * (z - c) );
    }

    static void solve (ArrayList<Double> X, ArrayList<Double> Y) {
        int n = X.size();
        double area = 0;
        
        for(int i = 1; i <= n-2; i++) {
            area += areaTriangle(X.get(0), Y.get(0), X.get(i), Y.get(i), X.get(i+1), Y.get(i+1));
        }

        System.out.printf("%.7f\n", area);

    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> pointsX = new ArrayList<Double>();
        ArrayList<Double> pointsY = new ArrayList<Double>();

        while(sc.hasNext()) {
            String[] line = sc.nextLine().split(",");
            pointsX.add(Double.parseDouble(line[0]));
            pointsY.add(Double.parseDouble(line[1]));
        }

        solve(pointsX, pointsY);

    }
}