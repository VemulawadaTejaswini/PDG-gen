import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] lo =reader.readLine().split(" ");
		int L = Integer.parseInt(lo[0]);
		int R = Integer.parseInt(lo[1]);
		int d = Integer.parseInt(lo[2]);
		int a = (L-1)/d;
		int b = (R)/d;
		System.out.println((b-a));
	}
}
