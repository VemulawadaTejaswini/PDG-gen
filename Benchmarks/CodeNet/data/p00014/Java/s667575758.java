import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			int sum = 0 , x = 0 , y , d , i = 0;
			d = sc.nextInt();
			while ( i < 600 ) {
				y = x * x;
				x += d;
				sum += y * d;
				i += d;
			}
			System.out.println(sum);
		}
	}
}