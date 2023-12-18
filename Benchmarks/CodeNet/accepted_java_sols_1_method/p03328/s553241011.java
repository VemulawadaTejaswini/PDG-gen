import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int diff = b - a;
		
		int ha = 0;
		for (int i = 1; i < diff; i++) {
			ha += i;
		}
		
		System.out.println(ha - a);
		
		sc.close();
	}
}