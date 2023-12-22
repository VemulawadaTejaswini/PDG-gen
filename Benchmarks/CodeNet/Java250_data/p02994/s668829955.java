import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		
		
		int max = l + n - 1;
		int sum = (l + max) * n / 2;
		
		if (max < 0) sum -= max;
		if (l > 0) sum -= l;
		
		System.out.println(sum);
		
		sc.close();
	}
	
}


