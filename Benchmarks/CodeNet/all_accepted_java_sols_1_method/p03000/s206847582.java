import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] l = new int[n];
		int[] d = new int[n+1];
		d[0] = 0;
		int count=0;
		if(d[0]<=x) count++;
		for (int i = 0; i <= n; i++) {
			if(i!=n)l[i] = sc.nextInt();
			if (i != 0) {
				d[i] = d[i - 1] + l[i - 1];
				if(d[i]<=x) count++;
			}
		}
		
		System.out.println(count);

	}
}
