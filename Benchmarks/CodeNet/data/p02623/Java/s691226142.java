import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for(int i = 0;i < n;i++) {
			a[i] = sc.nextInt();
		}
		for(int j = 0;j < m;j++) {
			b[j] = sc.nextInt();
		}
		int count = 0 ,count2 =0,count3 = 0;
		while(k > a[count] || k > b[count3]) {
			if(a[count]< b[count3]) {
				if(a[count] < k) {
					k = k-a[count];
					count++;
					count2++;
					if(n == count) {
						count--;
					}
				}
			}
			else {
				if(a[count]> b[count3]) {
					if(b[count3] < k) {
						k = k-b[count3];
						count3++;
						count2++;
						if(m == count) {
							count3--;
						}
					}
				}
			}
		}
		System.out.println(count2);
	}
}
