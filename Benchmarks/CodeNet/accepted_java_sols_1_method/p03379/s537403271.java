import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] og = new int[n];
		int[] srt = new int[n];
		for( int i = 0; i < n; i++ ) {
			og[i] = in.nextInt();
			srt[i] = og[i];
		}
		
		Arrays.sort(srt);
		int med = (int) n/2;
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for( int i = 0; i < n; i++ ) {
			if( i == med ) med--;
			hm.putIfAbsent(srt[i], srt[med]);
		}
		
		for( int i = 0; i < n; i++ ) {
			System.out.println(hm.get(og[i]));
		}
	}
}