import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int k = sc.nextInt();
		
		int ho = 60*h2-60*h1;
		int mi = m2-m1;
		
		int total = ho+mi;
		
		System.out.println(total-k);
		
 
	}
}