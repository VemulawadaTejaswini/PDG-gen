import java.util.*;
import java.io.*;

public class A
{
	public static void main(String[] ars)
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		String x = sc.next();
		s.append(x);
		if(s.charAt(s.length()-1) == 's')
			s.append("es");
		else
			s.append("s");
		System.out.println(s);
	}
	
	
}
