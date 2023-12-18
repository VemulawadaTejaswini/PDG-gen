import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int A = Integer.parseInt(sc.next());
			int B = Integer.parseInt(sc.next());
			int T = Integer.parseInt(sc.next());
			
			System.out.println((T / A) * B); 
		} // Scanner Close
	}
}