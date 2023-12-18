import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int k = 0;
		
		do {
			k++;
		}
		while (k * x % 360 != 0);
		
		System.out.println(k);
		
		sc.close();
	}
}


