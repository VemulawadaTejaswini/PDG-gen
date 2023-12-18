import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    double[] x = new double[4];
	    double[] y = new double[4];
	    String st;
	    double s1, s2, s3, S;
	    while((st=sc.readLine())!=null){
		String[] pp = st.split(" ");
		for(int i=0; i<4; i++){
		    x[i]=Double.valueOf(pp[2*i]);
		    y[i]=Double.parseDouble(pp[2*i+1]);
		}
		s1 = Math.abs((x[0]-x[3])*(y[1]-y[3])-(x[1]-x[3])*(y[0]-y[3]));
		s2 = Math.abs((x[1]-x[3])*(y[2]-y[3])-(x[2]-x[3])*(y[1]-y[3]));
		s3 = Math.abs((x[2]-x[3])*(y[0]-y[3])-(x[0]-x[3])*(y[2]-y[3]));
		S = Math.abs((x[0]-x[2])*(y[1]-y[2])-(x[1]-x[2])*(y[0]-y[2]));
		if(S-(s1+s2+s3)<0.001)
		    System.out.println("YES");
		else
		    System.out.println("NO");
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}