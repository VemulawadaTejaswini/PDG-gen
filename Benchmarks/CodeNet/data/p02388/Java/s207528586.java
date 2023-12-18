import java.io.*;

class Main{
	public static void main(String args[]){
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		String xstr = br.readline();
		int x=Integer.ParseInt(xstr);
		int y;
		if(x>=1 && x<=100){
			y=x*x*x;
			System.out.println(y);
		}
		
	}
}