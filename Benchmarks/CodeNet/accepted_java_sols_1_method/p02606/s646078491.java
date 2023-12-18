import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int L= keyboard.nextInt();
		long D = keyboard.nextInt();
		long d = keyboard.nextInt();
		
		long ans = 0;
		
		for(int i = L; i<D+1; i++) {
			if(i%d == 0) {
				ans++;
			}
		}
		
		System.out.print(ans);
		keyboard.close();	
		
	}
}