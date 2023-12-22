import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int X  = keyboard.nextInt();
		int T  = keyboard.nextInt();
		
		int ans = 0;
		if(N%X == 0) {
			ans = N/X*T;
		}else {
			ans = (N/X+1)*T;
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}