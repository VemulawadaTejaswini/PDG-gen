import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int m = x/500;
		int n = x%500;
		
		int l = n/5;
		
		System.out.println((m*1000)+(l*5));

	}

}
