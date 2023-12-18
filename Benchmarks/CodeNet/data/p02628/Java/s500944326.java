import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int K  = keyboard.nextInt();
		int[] p = new int[N];
		
		for(int i = 0; i < N ; i++) {
			p[i] = keyboard.nextInt();
		}
		
		Arrays.sort(p);
		int ans = 0;
		
		for(int j = 0; j < K; j++) {
			ans += p[j];
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
