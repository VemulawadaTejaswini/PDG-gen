import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int R= keyboard.nextInt();
		int G= keyboard.nextInt();
		int B= keyboard.nextInt();
		int K= keyboard.nextInt();
		
		String ans = "No";
		
		for(int c = K ;c>0; c--) {
			double ao = B * Math.pow(2, c);
			double midori = G * Math.pow(2, K-c);
			if(R<midori && midori<ao) {
				ans = "Yes";
			}
		}
		
		
		System.out.println(ans);
		keyboard.close();	
		
	}
}
