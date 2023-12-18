import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long cnt = x / 11;
		long ret = cnt * 11;
		cnt *= 2;
		int[] ary = new int[2];
		ary[0] = 6;
		ary[1] = 5;
		long index = 0;
		while (x > ret) {
			ret += ary[(int) index];
			cnt++;
			index = (index + 1) % 2;
		}
		System.out.println(cnt);

	}
}