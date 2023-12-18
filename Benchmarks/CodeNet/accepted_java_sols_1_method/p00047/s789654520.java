import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		a[0] = 1;
		while(sc.hasNext()) {
			String[] s = sc.next().split(",");
			int t0 = s[0].charAt(0) - 'A';
			int t1 = s[1].charAt(0) - 'A';
			int k = a[t0];
			a[t0] = a[t1];
			a[t1] = k;
		}
		sc.close();
		for(int i = 0; i < 3; i++) {
			if(a[i] == 1) {
				System.out.println((char)(i + 'A'));
				break;
			}
		}
	}
}
