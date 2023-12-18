import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            Double x1, x2, x3, y1, y2, y3, xp, yp;
            String line = br.readLine();
            while(line!=null) {
                StringTokenizer st = new StringTokenizer(line);
                x1 = Double.parseDouble(st.nextToken());
                y1 = Double.parseDouble(st.nextToken());
                x2 = Double.parseDouble(st.nextToken());
                y2 = Double.parseDouble(st.nextToken());
                x3 = Double.parseDouble(st.nextToken());
                y3 = Double.parseDouble(st.nextToken());
                xp = Double.parseDouble(st.nextToken());
                yp = Double.parseDouble(st.nextToken());
                Triangle tri = new Triangle(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
                if(tri.hasPoint(xp,yp)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
                line = br.readLine();
            }
        } catch (Exception e) {
            System.err.println();
        }
    }
}

class Point{
    double x;
    double y;
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}

class Triangle{
    Point A;
    Point B;
    Point C;
    double a,b,c;
    Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    boolean hasPoint(double x,double y){
        double elementA,elementB,elementC,elementD,elementP,elementQ,s,t,detA;
        elementA = A.x-B.x;
        elementB = C.x-B.x;
        elementC = A.y-B.y;
        elementD = C.y-B.y;
        elementP = x - B.x;
        elementQ = y - B.y;
        detA = elementA*elementD - elementB*elementC;
        s=(elementD*elementP-elementB*elementQ)/detA;
        t=(-elementC*elementP+elementA*elementQ)/detA;
        if(0<s+t && s+t<1){
            return true;
        }
        return false;
    }
}