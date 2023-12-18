
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, count = 3;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a == b && a == c)count = 1;
		else if(a == b && a != c)count = 2;
		else if(a == c && a != b)count = 2;
		else if(b == c && a != b)count = 2;
		
		System.out.println(count);
		
		sc.close();
	}

}
