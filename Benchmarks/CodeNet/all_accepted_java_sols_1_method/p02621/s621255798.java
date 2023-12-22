import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int a = Integer.parseInt(reader.readLine());
	int res = a+a*a+a*a*a;
	System.out.println(res);
	}
}
