import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N= keyboard.nextInt();
		int[] a = new int[N+1];
		
		for(int i = 1; i<N+1; i++) {
			a[i]= keyboard.nextInt();
		}
		
		int ans = 0;
		
		for(int j = 1; j<N+1; j++) {
			if(j%2 != 0 && a[j]%2 != 0) {
				ans++;
			}
		}
		
		System.out.print(ans);
		keyboard.close();	
		
	}
}
