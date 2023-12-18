import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		boolean[] x = new boolean[n];
		int count = 0;

		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			x[i] = true;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j) {
					if(a[i]%a[j]==0) {
						x[i]=false;
						continue;
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(x[i]==true) {
				count++;
			}
		}
		System.out.println(count);
	}
}