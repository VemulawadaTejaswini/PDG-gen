import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int a=Integer.parseInt(str[0]);
		int b=Integer.parseInt(str[1]);
		
		int d=a/b;
		int e=a%b;
		double f=(double)a/b;
		
		System.out.printf("%d %d %.5f\n",d,e,f);
				
	}

}