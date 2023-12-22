import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int A = a.nextInt();
		int B = a.nextInt();
		if(A < B) {
			System.out.println("a < b");
		} else if (A > B) {
			System.out.println("a > b");
		} else {
			System.out.println("a == b");
		}
		
	}

}