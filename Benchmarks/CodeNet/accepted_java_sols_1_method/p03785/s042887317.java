import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { //WOOOOOOO AtCoder is HELPING!!!!!!!!!!
		//Arraylist cheese for the win
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] times = new int[N];
		long cap = input.nextLong();
		long extra = input.nextLong();
		long ans = 0;
		for (int i = 0; i < N; i++) {
			times[i] = input.nextInt();
		}
		Arrays.sort(times);
		for (int START = 0; START < N; START++) {
			int newSTART = START;
			for (int next = START+1; next < Math.min(N, START+cap); next++) {
				int diff = times[next]-times[START];
				if (diff>extra) break;
				else newSTART++;
			}
			ans++;
			START=newSTART;
		}
		System.out.println(ans);
	}
}