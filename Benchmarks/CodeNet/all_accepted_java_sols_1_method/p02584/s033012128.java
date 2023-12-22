import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long X = keyboard.nextLong();
		long K = keyboard.nextLong();
		long D = keyboard.nextLong();
		long XX = Math.abs(X);
		
		long ans = 0;
		long count = XX/D;
		
		if(count>=K) {
			ans = XX - K*D;
		}else {
			ans = Math.abs(XX%D-(K-count)%2*D);
		}
		
		System.out.print(ans);
		keyboard.close();
	}
}