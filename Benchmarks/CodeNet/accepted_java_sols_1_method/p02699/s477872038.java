import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
				
		int S = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		if (W >= S)
			System.out.println("unsafe");
		else
			System.out.println("safe");
	}
}
