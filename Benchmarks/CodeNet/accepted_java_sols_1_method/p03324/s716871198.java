import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int D = keyboard.nextInt();
		int N = keyboard.nextInt();
		
		int ans = 0;
		
		
		if(D == 0) {
			if(N%100 != 0) {
				ans = N;
			}else {
				ans = 101;
			}
		}else if(D == 1) {
			if(N%100 != 0) {
				ans = 100*N;
			}else {
				ans = 10100;
			}
		}else if(D == 2) {
			if(N%100 != 0) {
				ans = 100*100*N;
			}else {
				ans = 1010000;
			}
		}
		
		
		System.out.print(ans);
		keyboard.close();	
		
	}
}
