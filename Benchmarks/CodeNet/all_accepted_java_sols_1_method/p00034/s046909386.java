
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			int v1 , v2 ,result = 0 , k = 0;
			int[] kukan = new int[10];
			double sum = 0 , n;
			String line;
			line = sc.nextLine();
			String[] t = line.split(",");
			for ( int i = 0; i < 10; i++ ) {
				kukan[i] = Integer.parseInt(t[i]);
				sum += kukan[i];
			}
			v1 = Integer.parseInt(t[10]);
			v2 = Integer.parseInt(t[11]);
			n = v1 * (sum / ( v1 + v2 ) );
			while ( result < n )
				result += kukan[k++];
			System.out.println(k);
		}
	}
}