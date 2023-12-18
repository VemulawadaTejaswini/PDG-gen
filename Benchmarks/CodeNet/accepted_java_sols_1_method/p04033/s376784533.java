import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		if (a > 0 && b > 0) {
			System.out.println("Positive");
		} else if (a < 0 && b < 0 && (a + b) % 2 == 0 && a != b) {
			System.out.println("Negative");
		} else if (a < 0 && b < 0 && (a + b) % 2 == 1 && a != b) {
			System.out.println("Positive");
		} else if (a * b <= 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Positive");
		}
		
	}
}
