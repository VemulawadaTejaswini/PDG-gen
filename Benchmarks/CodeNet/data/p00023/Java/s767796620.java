import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	try{
	    double AB, dr;
	    int n = Integer.valueOf(sc.readLine());
	    double[] x = new double[6];
	    for(int i=0; i<n; i++){
		String[] st = sc.readLine().split(" ");
		for(int j=0; j<6; j++)
		    x[j]=Double.valueOf(st[j]);
		AB = Math.sqrt((x[3]-x[0])*(x[3]-x[0])+(x[4]-x[1])*(x[4]-x[1]));
		if(x[2]+x[5]>=AB){
		    if(AB<=x[2]-x[5])
			System.out.println(2);
		    else if(AB<=x[5]-x[2])
			System.out.println(-2);
		    else
			System.out.println(1);
		}
		else
		    System.out.println(0);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}