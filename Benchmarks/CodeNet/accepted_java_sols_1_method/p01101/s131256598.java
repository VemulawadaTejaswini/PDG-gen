import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, i, j;
		int sum = 0, max = 0, count = 0;
		while(true){
			n = sc.nextInt();
			m = sc.nextInt();
			if(n == 0 || m == 0) break;
			int[] a = new int[n];
			for(i = 0; i < n ; i++) {
				a[i] = sc.nextInt();
			}
			for(i = 0; i < n ; i++) {
				for(j = 0; j < n ; j++) {
					if(i == j) {
						continue;
					}
					sum = a[i] + a[j];
					if(m >= sum) {
						if(sum > max) {
							max = sum;
							count++;
						}
					}
				}
			}
			if(count != 0) {
				System.out.println(max);
			}else{
				System.out.println("NONE");
			}
			sum = 0;
			max = 0;
			count = 0;
		}
		sc.close();
	}
}
