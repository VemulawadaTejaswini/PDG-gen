import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		
		System.out.println(x <= 500 * k ? "Yes" : "No");
		sc.close();
	}
	
}