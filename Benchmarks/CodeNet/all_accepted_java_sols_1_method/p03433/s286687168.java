import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
 
		int b = n % 500;
		System.out.println(b <= a ? "Yes" : "No");
	}
}