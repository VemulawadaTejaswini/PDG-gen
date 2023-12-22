import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		int n = in.nextInt();
		int d = in.nextInt();
		int count = 0;
		for(int i=0;i<n;i++){
			int x = in.nextInt();
			int y = in.nextInt();
			
			double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			if(distance <= d)
				count++;
		}
		out.println(count);
	}
}
