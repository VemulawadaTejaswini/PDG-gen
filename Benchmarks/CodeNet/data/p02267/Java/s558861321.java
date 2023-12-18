import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n + 1];
		for(int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int[] t = new int[q];
		for(int i = 0; i < q; i++) {
			t[i] = sc.nextInt();
		}
		sc.close();
		int sameValueNum = 0;
		outside: for(int target: t) {
			s[n] = target;
			int index = 0;
			while(true) {
				if(target == s[index]) {
					if(index != n) {
						sameValueNum++;
					}
					continue outside;
				}
				index++;
			}
		}
		System.out.println(sameValueNum);

	}

}