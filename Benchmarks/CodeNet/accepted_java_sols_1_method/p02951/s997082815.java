import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int Capacity = A-B;
		System.out.println(Math.max(C-Capacity, 0));
		
		sc.close();	
	}

}