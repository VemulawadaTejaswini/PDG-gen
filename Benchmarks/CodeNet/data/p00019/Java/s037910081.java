
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getFactorial(sc.nextInt()));
	}
	
	public static long getFactorial(int n){
		long factorial = 1;
		for(int i = n; i > 1; i--){
			factorial = factorial * i;
		}
		return factorial;
	}
}