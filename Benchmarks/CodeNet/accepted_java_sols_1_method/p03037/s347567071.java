import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		int[] L = new int[M];
		int[] R = new int[M];
		int lMax = Integer.MIN_VALUE;
		int rMin = Integer.MAX_VALUE;
		for(int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			L[i] = Integer.parseInt(tokens[0]);
			R[i] = Integer.parseInt(tokens[1]);
			lMax = Math.max(L[i], lMax);
			rMin = Math.min(rMin, R[i]);
		}
		int result = rMin - lMax + 1;
		if(result< 0) {
			result = 0;
		}
		System.out.println(result);
		in.close();
	}
}