import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		if (A % 2 == 1 && B % 2 == 1 && C % 2 == 1) {
			long[] map = new long[] {A, B, C};
			Arrays.sort(map);
			System.out.println(map[0] * map[1]);
		} else {
			System.out.println(0);
		}
	}
}