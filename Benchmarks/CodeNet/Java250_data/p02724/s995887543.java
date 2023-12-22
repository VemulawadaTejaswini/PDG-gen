import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(in.readLine());
		
		System.out.println((long) 1000 * (x/500) + 5 * ((x%500)/5));
	}
}
