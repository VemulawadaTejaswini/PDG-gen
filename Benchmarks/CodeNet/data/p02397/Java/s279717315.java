import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a,b;

		while(true){
			a = sc.nextInt();
			b = sc.nextInt();

			if(a == 0 && b == 0)break;

			System.out.printf("%d %d\n", Math.min(a, b),Math.max(a, b));
		}

	}
}


