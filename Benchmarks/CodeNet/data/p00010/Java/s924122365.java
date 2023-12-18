import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            DecimalFormat df = new DecimalFormat("0.000");
            float x1,x2,x3,y1,y2,y3;
            String line = br.readLine();
            int n = Integer.parseInt(line);
            for(int i=0;i<n;i++) {
                line = br.readLine();
                StringTokenizer st = new StringTokenizer(line);
                x1 = Float.parseFloat(st.nextToken());
                y1 = Float.parseFloat(st.nextToken());
                x2 = Float.parseFloat(st.nextToken());
                y2 = Float.parseFloat(st.nextToken());
                x3 = Float.parseFloat(st.nextToken());
                y3 = Float.parseFloat(st.nextToken());
                Triangle tri = new Triangle(new Point(x1,y1),new Point(x2,y2),new Point(x3,y3));
                System.out.println(df.format(tri.getP().x) + " " + df.format(tri.getP().y) + " " + df.format(tri.getR()));
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

class Line{
    Point A;
    Point B;
    double length;
    Line(Point A, Point B){
        this.A = A;
        this.B = B;
        this.length = getLength();
    }
    private double getLength(){
        return Math.sqrt((A.x-B.x)*(A.x-B.x) + (A.y-B.y)*(A.y-B.y));
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
        this.a = (new Line(B,C)).length;
        this.b = (new Line(A,C)).length;
        this.c = (new Line(A,B)).length;
    }
    double getCosA(){
        double cosA;
        cosA = (b*b + c*c -a*a)
                /(2*b*c);
        return cosA;
    }
    double getSinA(){
        double sinA,cosA = getCosA();
        sinA = Math.sqrt(1-(cosA*cosA));
        return sinA;
    }
    double getR(){
        double R,sinA = getSinA();
        R = a/(2*sinA);
        return R;
    }
    Point getP(){
        double m,l;
        m=(
                (A.x-B.x)*(C.x*C.x+C.y*C.y)+(B.x-C.x)*(A.x*A.x+A.y*A.y)+(C.x-A.x)*(B.x*B.x+B.y*B.y)
        )/(
                (A.x-B.x)*(A.y-C.y)-(A.x-C.x)*(A.y-B.y)
        );
        l=(
                A.x*A.x+A.y*A.y-B.x*B.x-B.y*B.y+m*(A.y-B.y)
        )/(
                B.x-A.x
        );

        return new Point(-l/2,-m/2);

    }
}