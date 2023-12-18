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
        Vector p1 = new Vector(sc.nextInt(), sc.nextInt());
        Vector p2 = new Vector(sc.nextInt(), sc.nextInt());
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            Vector p = new Vector(sc.nextInt(), sc.nextInt());

            Vector ans = p.reflection(p1,p2);
            System.out.println(ans.x + " " + ans.y);

        }

    }
}

class Vector{
    public static double EPS = 1e-10;
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
    
    public Vector reflection(Vector seg1, Vector seg2){
        Vector projected = this.project(seg1, seg2);
        Vector ashi = projected.minus(this);
        return this.plus(ashi.multiple(2));
    }
}
