import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	String s;
	int x;
	s= buf.readLine();
	x= Integer.parseInt(s);
	int a = x/3600;
	int b = (x-60*a)/60;
	int c = x- a*3600 - b*60;
	System.out.println(a+":"+b+":"+c);
	}
}