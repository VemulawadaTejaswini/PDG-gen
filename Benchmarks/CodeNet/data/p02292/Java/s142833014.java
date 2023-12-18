import java.util.*;
//import java.io.*;
import java.util.stream.IntStream;

public class Main{
    static int sum=0;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
        Vector p0 = new Vector(sc.nextInt(), sc.nextInt());
        Vector p1 = new Vector(sc.nextInt(), sc.nextInt());
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            Vector p2 = new Vector(sc.nextInt(), sc.nextInt());

            int iAns = Vector.ccw(p0,p1,p2);
            String ans="";
            switch (iAns) {
                case Vector.COUNTER_CLOCKWISE: ans = "COUNTER_CLOCKWISE";break;
                case Vector.CLOCKWISE: ans = "CLOCKWISE";break;
                case Vector.ONLINE_BACK: ans = "ONLINE_BACK";break;
                case Vector.ONLINE_FRONT: ans = "ONLINE_FRONT";break;
                case Vector.ON_SEGMENT: ans = "ON_SEGMENT";break;
                default:break;
            }
            System.out.println(ans);

        }

    }
}

class Vector{
    public static final double EPS = 1e-10;
    public static final int COUNTER_CLOCKWISE=1;
    public static final int CLOCKWISE=-1;
    public static final int ONLINE_BACK=2;
    public static final int ONLINE_FRONT=-2;
    public static final int ON_SEGMENT=0;

    public double x,y;

    public Vector(){}
    public Vector(double x, double y){this.x=x;this.y=y;}

    public Vector plus(Vector p){return new Vector(this.x+p.x, this.y+p.y);}
    public Vector minus(Vector p){return new Vector(this.x-p.x, this.y-p.y);}
    public Vector multiple(double a){return new Vector(this.x*a, this.y*a);}
    public Vector divide(double a){return new Vector(this.x/a, this.y/a);}

    public double abs(){return Math.sqrt(this.norm());}
    public double norm(){return x*x+y*y;}

    
    public static double dot(Vector a, Vector b){
        return a.x*b.x+a.y*b.y;
    }

    public static double cross(Vector a, Vector b){
        return a.x*b.y-a.y*b.x;
    }

    //point.projectで垂線の足の座標
    public Vector project(Vector seg1, Vector seg2){
        Vector seg = seg2.minus(seg1);
        Vector relPoint = this.minus(seg1);
        double t = dot(seg, relPoint)/seg.norm();
        return seg1.plus(seg.multiple(t));
    }
    
    //point.reflectionで対称点
    public Vector reflection(Vector seg1, Vector seg2){
        Vector projected = this.project(seg1, seg2);
        Vector ashi = projected.minus(this);
        return this.plus(ashi.multiple(2));
    }

    //p0が始点
    public static int ccw(Vector p0, Vector p1, Vector p2){
        Vector s1 = p1.minus(p0);
        Vector s2 = p2.minus(p0);

        double cross = Vector.cross(s1, s2);
        double dot = Vector.dot(s1, s2);

        if(cross>0){return COUNTER_CLOCKWISE;}
        if(cross<0){return CLOCKWISE;}
        if(dot<0){return ONLINE_BACK;}
        if(s1.abs()<s2.abs()){return ONLINE_FRONT;}
        return ON_SEGMENT;
    }
}
