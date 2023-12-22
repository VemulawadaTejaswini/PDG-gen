import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
 
		int K = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
 
		int total = (B / K) * K;
		
		if (A <= total) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
		scanner.close();
     
	}
}