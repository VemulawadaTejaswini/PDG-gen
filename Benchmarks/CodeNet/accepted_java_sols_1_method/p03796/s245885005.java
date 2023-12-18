import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		long power = 1;
		
		for(int i = 0; i < n; i++) {
			power = power * (i+1) % (long)(1e9+7);
		}
		
		System.out.println(power);
		
	}

}
