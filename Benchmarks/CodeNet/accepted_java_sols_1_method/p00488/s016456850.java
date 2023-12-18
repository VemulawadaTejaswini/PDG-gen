import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = 2000;
		int j = 2000;
		int x = 0;
		
		for(int i = 0; i < 3; i++) {
			x = sc.nextInt();
			if(p > x)p = x;
			
		}
		for(int i = 0; i < 2; i++) {
			x = sc.nextInt();
			if(j > x)j = x;
		}
		System.out.println(p + j - 50);

	}

}