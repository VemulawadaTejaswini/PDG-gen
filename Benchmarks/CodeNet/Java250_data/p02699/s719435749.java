import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer S = sc.nextInt();
		Integer W = sc.nextInt();
		
		if(W >= S) {
			System.out.println("unsafe");
		} else {
			System.out.println("safe");
		}
	}
}