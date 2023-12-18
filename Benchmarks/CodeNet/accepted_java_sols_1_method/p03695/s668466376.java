import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int[] sum = new int[9];
		for(int i = 0 ; i < n ; i++) {
			if(0 <= a[i] && a[i] < 400) sum[0]++;
			else if(400 <= a[i] && a[i] < 800) sum[1]++;
			else if(800 <= a[i] && a[i] < 1200) sum[2]++;
			else if(1200 <= a[i] && a[i] < 1600) sum[3]++;
			else if(1600 <= a[i] && a[i] < 2000) sum[4]++;
			else if(2000 <= a[i] && a[i] < 2400) sum[5]++;
			else if(2400 <= a[i] && a[i] < 2800) sum[6]++;
			else if(2800 <= a[i] && a[i] < 3200) sum[7]++;
			else if(3200 <= a[i]) sum[8]++;
		}
		int max = 0;
		int min = 0;
		int hatena = sum[8];
		for(int i = 0 ; i < 8 ; i++) {
			if(sum[i] >= 1) {
				max++;
				min++;
			}
		}
		if(min == 0) {
			System.out.println(1 + " " + hatena);
		} else {
			System.out.println(min + " " + (max + hatena));
		}
	}
}
