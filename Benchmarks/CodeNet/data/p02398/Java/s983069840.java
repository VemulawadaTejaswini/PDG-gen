import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a, b, c, n, i;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		n = 0;
		for(i = a; i <= b; i++) {
			if(c % i == 0) n++;
		}
		
		System.out.println(n);
		
	}

}
