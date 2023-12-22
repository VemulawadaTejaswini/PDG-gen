import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k = sc.nextInt();
		int[] d = new int[k];
		int[] dis = new int[10];
		for(int i = 0 ; i < k ; i++) {
			d[i] = sc.nextInt();
			dis[d[i]]++;
		}
		for(int i = a ; i <= 10 * a ; i++) {
			int temp = i;
			int cnt = 0;
			while(temp > 0) {
				boolean match = false;
				for(int j = 0 ; j < k ; j++) {
					if(dis[temp % 10] == 1) {
						match = true;
					}
				}
				if(match) cnt++;
				temp /= 10;
			}
			if(cnt == 0) {
				System.out.println(i);
				return;
			}
		}
	}
}