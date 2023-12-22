import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int a[] = new int[N];
		
		for(int i=0; i<N; i++) {
			a[i]  = keyboard.nextInt();
		}
		
		int ans = 0;
		
		for(int i = 0; i<N; i++) {
			while(a[i]%2 != 1) {
				ans++;
				a[i] /= 2;
			}
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
