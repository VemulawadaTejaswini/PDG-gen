import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] i=str.split(" ");
		int a=Integer.parseInt(i[0]);
		int b=Integer.parseInt(i[1]);
		
		int d=a/b;
		int e=a%b;
		double f=(double)a/b;
		
		System.out.printf("%d %d %.5f",d,e,f);
	}

}