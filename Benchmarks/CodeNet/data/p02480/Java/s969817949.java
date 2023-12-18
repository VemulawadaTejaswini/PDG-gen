import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		int n;
		
		n = readNumber();
		n *= n * n;
		System.out.println(n);
	}
	
	public static int readNumber()
	{
		byte b[] = new byte[100];
		
		try {
			System.in.read(b);
			return Integer.parseInt((new String(b)).trim());
		} catch (Exception e){
			return 0;
		}
	}
}