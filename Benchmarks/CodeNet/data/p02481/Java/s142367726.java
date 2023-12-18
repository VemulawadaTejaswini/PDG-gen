import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		int a, b;
		int r, S;
		
		a = readNumber();
		b = readNumber();
		
		r = (a + b) * 2;
		S = a * b;
		
		System.out.println(r + " " + S);
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