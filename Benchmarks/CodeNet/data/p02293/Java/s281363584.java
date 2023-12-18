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
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            Vector p0 = new Vector(sc.nextInt(), sc.nextInt());
            Vector p1 = new Vector(sc.nextInt(), sc.nextInt());
            Vector p2 = new Vector(sc.nextInt(), sc.nextInt());
            Vector p3 = new Vector(sc.nextInt(), sc.nextInt());

            Vector s1 = p0.minus(p1);
            Vector s2 = p2.minus(p3);
            if(Vector.cross(s1, s2)==0){
                System.out.println(2);
                continue;
            }else if(Vector.dot(s1, s2)==0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
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
    public Vector multiple(Vector p){return new Vector(this.x*p.x, this.y*p.y);}
    public Vector divide(Vector p){return new Vector(this.x/p.x, this.y/p.y);}

    public double abs(){return Math.sqrt(this.norm());}
    public double norm(){return x*x+y*y;}

    
    public static double dot(Vector a, Vector b){
        return a.x*b.x+a.y*b.y;
    }

    public static double cross(Vector a, Vector b){
        return a.x*b.y-a.y*b.x;
    }
    
}
