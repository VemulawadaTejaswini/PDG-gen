import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		Integer[] d = new Integer[N];
		for(int i = 0;i < N;i++){
			d[i] = Integer.parseInt(spl[i]);
		}
		sc.close();
		Arrays.sort(d,Collections.reverseOrder());
		System.out.println(d[(N/2) - 1] - d[N/2]);
	}
}