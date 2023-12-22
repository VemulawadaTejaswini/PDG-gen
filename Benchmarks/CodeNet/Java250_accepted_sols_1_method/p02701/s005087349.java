import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		String[] S = new String[N];
		
		for(int n=0; n<N; n++) {
			S[n] = keyboard.next();
		}
		Arrays.parallelSort(S);
		int ans = 0;
		
		for(int i =0; i<N; i++) {
			if(i == 0) {
				ans++;
			}else {
				if(!(S[i].equals(S[i-1]))) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);
		keyboard.close();
	}
}
