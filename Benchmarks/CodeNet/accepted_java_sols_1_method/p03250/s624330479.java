import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int i;
		for(i = 0;i < 3;i ++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		String as = String.valueOf(a[2]) + String.valueOf(a[1]);
		int ai = Integer.valueOf(as);
		System.out.println(ai+a[0]);
	}
}