import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i , n , result;
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			i = sc.nextInt();
			result = 2;
			for ( n = 2; n <= i; n++ )
				result += n;
			System.out.printf("%d\n",result);
		}
	}
}