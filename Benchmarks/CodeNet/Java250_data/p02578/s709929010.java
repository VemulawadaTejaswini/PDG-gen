import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		long a1 = keyboard.nextLong();
		long sum = 0;
		
		for(int n=1; n<N; n++) {
			long a = keyboard.nextLong();
			if(a<a1) {
				sum += a1-a;
			}else {
				a1 = a;
			}
		}
		
		System.out.print(sum);
		keyboard.close();
	}
}