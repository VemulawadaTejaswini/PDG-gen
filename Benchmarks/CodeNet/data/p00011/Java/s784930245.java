import java.io.*;
import java.util.*;

public class Main {
	
	public static int[] swap (int[] sticks, int s, int g) {
		
		int work = 0;
		
		work = sticks[g];
		sticks[g] = sticks[s];
		sticks[s] = work;
		
		return sticks;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int[] sticks = new int[Integer.parseInt(br.readLine()) + 1];
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i < sticks.length; i++) {
			sticks[i] = i;
		}
		
		for (int i = 0; i < n; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(),",");
			sticks = swap(sticks,Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			
		}
		
		for (int s : sticks) {
			if (s == 0) continue;
			System.out.println(s);
		}
		
	}
	
}