import java.util.*;
import java.lang.*;
import java.io.*;



public class Main {
   public static void main(String[] args) throws IOException{
           final   Scanner scan = new Scanner(System.in);
           int n=scan.nextInt();
           System.out.println("0.000000 0.000000");
           koch(new double[]{0,0}, new double[]{100,0},n);
           System.out.println("100.000000 0.000000");
   }
   
   public static void koch(double[] p,double[] q,int n){
           double pi=Math.PI/3;
        if(n==0) return;
        double[] S={(2*p[0]+q[0])/3,(2*p[1]+q[1])/3};
        double[] T={(p[0]+2*q[0])/3,(p[1]+2*q[1])/3};
        double[] U={(T[0]-S[0])*Math.cos(pi)-(T[1]-S[1])*Math.sin(pi)+S[0],(T[0]-S[0])*Math.sin(pi)+(T[1]-S[1])*Math.cos(pi)+S[1]};

        koch(p.clone(),S.clone(),n-1);
    System.out.println(S[0]+" "+S[1]);
        koch(S.clone(),U.clone(),n-1);
        System.out.println(U[0]+" "+U[1]);
        koch(U.clone(),T.clone(),n-1);
        System.out.println(T[0]+" "+T[1]);
        koch(T.clone(),q.clone(),n-1);   
   }
}