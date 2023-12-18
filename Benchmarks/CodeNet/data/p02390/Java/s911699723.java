import java.io.*;
class Main
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int S=Integer.parseInt(br.readLine());
		int h,m,s;
		
		h=S/3600;
		m=S%3600/60;
		s=S%60;
		System.out.print(h+":"+m+":"+s);
	}
}