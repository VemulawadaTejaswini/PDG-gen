import java.io.*;
class Main{
	public static void main (String[] args)throws IOException{
		int a, b, men=0, len=0;
		
		BufferedReader d =new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(d.readLine());
		b = Integer.parseInt(d.readLine());
		
		men = a*b;
		len = a*2+b*2;
		
		System.out.println(men+" "+len);
	}
}