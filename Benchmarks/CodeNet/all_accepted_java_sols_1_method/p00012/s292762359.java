import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String args[])throws Exception{
        Scanner cin= new Scanner(System.in);
		
		while(cin.hasNextDouble()){
			double in[] = new double[8];
			for(int i=0;i<8;i++) in[i]= cin.nextDouble();
			int t1,t2,t3;
			t1= java.awt.geom.Line2D.relativeCCW(in[0],in[1],in[2],in[3],in[6],in[7]);
			t2= java.awt.geom.Line2D.relativeCCW(in[2],in[3],in[4],in[5],in[6],in[7]);
			t3= java.awt.geom.Line2D.relativeCCW(in[4],in[5],in[0],in[1],in[6],in[7]);
			if((t1==1 && t2==1 && t3==1) || (t1==-1 && t2==-1 && t3==-1)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}