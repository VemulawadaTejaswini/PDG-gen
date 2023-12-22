import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		for (int i = 1; i < 6; i++) {
 			long N = scanner.nextInt();
 			if (N != i) {
 				System.out.println(i);
 			}
 		}
 	}
 }