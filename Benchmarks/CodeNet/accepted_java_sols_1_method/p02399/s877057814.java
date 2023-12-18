import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		String[] num=str.split(" ");
		int a=Integer.parseInt(num[0]);
		int b=Integer.parseInt(num[1]);
		
		int d=a/b;
		int r=a%b;
		String f=String.format("%.5f",(double)a/b);
		
		System.out.println(d+" "+r+" "+f);
	}
}