import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());
	System.out.println("0.000000 0.000000");
	koch(new double[]{0,0}, new double[]{100,0},n);
	System.out.println("100.000000 0.000000");
    }
    static void koch(double[] p,double[] q,int n){
	double pi=Math.PI/3;
        if(n==0)
	    return;
        double[] s={(2*p[0]+q[0])/3,(2*p[1]+q[1])/3};
        double[] t={(p[0]+2*q[0])/3,(p[1]+2*q[1])/3};
	
        double[] u={(t[0]-s[0])*Math.cos(pi)-(t[1]-s[1])*Math.sin(pi)+s[0],(t[0]-s[0])*Math.sin(pi)+(t[1]-s[1])*Math.cos(pi)+s[1]};

        koch(p.clone(),s.clone(),n-1);
	System.out.println(s[0]+" "+s[1]);
	
        koch(s.clone(),u.clone(),n-1);
        System.out.println(u[0]+" "+u[1]);
	
        koch(u.clone(),t.clone(),n-1);
        System.out.println(t[0]+" "+t[1]);
	
        koch(t.clone(),q.clone(),n-1);   
   }
}

