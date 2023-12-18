import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		long a = Integer.parseInt(str[0]);
		long b = Integer.parseInt(str[1]);
		Double ad = new Double(a);
		Double bd = new Double(b);
		System.out.println(a / b + " " + a % b + " " + String.format("%.5f", ad / bd));
	}
}