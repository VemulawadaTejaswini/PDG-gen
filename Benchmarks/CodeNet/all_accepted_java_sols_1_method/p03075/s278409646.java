import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		
		int max = Math.max(b-a, c-a);
		max = Math.max(max, d-a);
		max = Math.max(max, e-a);
		max = Math.max(max, c-b);
		max = Math.max(max, d-b);
		max = Math.max(max, e-b);
		max = Math.max(max, d-c);
		max = Math.max(max, e-c);
		max = Math.max(max, e-d);
		
		if (max<=k)
			System.out.println("Yay!");
		else
			
			System.out.println(":(");
	}

}