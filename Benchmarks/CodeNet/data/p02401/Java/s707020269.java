import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String[] buf = in.readLine().split(" ");
				long a = Long.parseLong(buf[0]);
				long b = Long.parseLong(buf[2]);
				long r = 0;
				if ("+".equals(buf[1])) {
					r = a + b;
				} else if ("-".equals(buf[1])) {
					r = a - b;
				} else if ("*".equals(buf[1])) {
					r = a * b;
				} else if ("/".equals(buf[1])) {
					r = a / b;
				} else if ("?".equals(buf[1])) {
					break;
				} else {
					return;
				}
				System.out.println(r);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
		
	}
}