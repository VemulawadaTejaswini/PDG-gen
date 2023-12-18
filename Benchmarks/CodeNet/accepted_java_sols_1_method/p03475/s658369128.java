import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] c = new int[n - 1];
		int[] s = new int[n - 1];
		int[] f = new int[n - 1];
		for(int i = 0 ; i < n - 1 ; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n - 1 ; i++) {
			int nowT = s[i];
			for(int j = i ; j < n - 1 ; j++) {
				if(i == j) {
					nowT += c[j];
				} else {
					int temp = s[j];
					while(nowT > temp) {
						temp += f[j];
					}
					nowT = temp;
					nowT += c[j];
				}
			}
			System.out.println(nowT);
		}
		System.out.println(0);
	}
}
