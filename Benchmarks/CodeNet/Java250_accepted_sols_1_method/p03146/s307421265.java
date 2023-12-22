import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		boolean[] a = new boolean[1000001];Arrays.fill(a, false);
		a[s] = true;
		for (int m = 2; m < 1000001; m++) {
			s = (s%2==0)?s/2:s*3+1;
			if(a[s]) {
				System.out.println(m);
				break;
			}else a[s] = true;
		}
		sc.close();
	}
}