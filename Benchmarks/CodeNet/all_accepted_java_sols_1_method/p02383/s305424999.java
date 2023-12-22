import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] arsg) throws IOException{
		Scanner scan = new Scanner(System.in);
		
		int[] x = new int[6];
		
		for(int i = 0;i<6;i++){
			x[i] = scan.nextInt();
		}
		String str = scan.next();
		
		for(int i = 0;i<str.length();i++){
			char y = str.charAt(i);
			if(String.valueOf(y).equals("S")){
				int a = x[0];
				int b = x[1];
				int c = x[2];
				int d = x[3];
				int e = x[4];
				int f = x[5];
				x[0]=e;
				x[1]=a;
				x[2]=c;
				x[3]=d;
				x[4]=f;
				x[5]=b;		
			}
			else if(String.valueOf(y).equals("E")){
				int a = x[0];
				int b = x[1];
				int c = x[2];
				int d = x[3];
				int e = x[4];
				int f = x[5];
				x[0]=d;
				x[1]=b;
				x[2]=a;
				x[3]=f;
				x[4]=e;
				x[5]=c;
			}
			else if(String.valueOf(y).equals("N")){
				int a = x[0];
				int b = x[1];
				int c = x[2];
				int d = x[3];
				int e = x[4];
				int f = x[5];
				x[0]=b;
				x[1]=f;
				x[2]=c;
				x[3]=d;
				x[4]=a;
				x[5]=e;
			}
			else if(String.valueOf(y).equals("W")){
				int a = x[0];
				int b = x[1];
				int c = x[2];
				int d = x[3];
				int e = x[4];
				int f = x[5];
				x[0]=c;
				x[1]=b;
				x[2]=f;
				x[3]=a;
				x[4]=e;
				x[5]=d;
			}
		}
		
		System.out.println(x[0]);
	}
}							