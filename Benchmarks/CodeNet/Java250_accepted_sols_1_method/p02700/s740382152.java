import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		int t1 = (int) Math.ceil((double) C / B);
		int t2 = (int) Math.ceil((double) A / D);
		
		if (t1 <= t2)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}