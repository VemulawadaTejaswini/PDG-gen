import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		String ans = a<b && b<c ? "Yes" : "No";
		System.out.println(ans);
		scanner.close();
	}
}