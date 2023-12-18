import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double x,y;
		while(br.readLine() != null){
			String[] num = br.readLine().split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			int c = Integer.parseInt(num[2]);
			int d = Integer.parseInt(num[3]);
			int e = Integer.parseInt(num[4]);
			int f = Integer.parseInt(num[5]);
			
			x=(f*b-c*e)/(d*b-a*e);
			y=(-a*x+c)/b;
		
			System.out.printf("%.3f %.3f\n",x,y);
		}
	}
}
		
			
			