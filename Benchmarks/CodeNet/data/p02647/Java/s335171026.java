import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}

		int[] level = new int[n];
		for(int i = 0; i < n; i++) {
			level[i] = 1;
		}
		int d = 0;
		int cnt = 0;
		for(int i = 0 ; i < n;i++) {
			d = num[i];
			cnt = 0;
			for(int j = i - 1;  cnt < d; j--) {
				try{
					level[j]++;
				}catch(ArrayIndexOutOfBoundsException e) {
					break;
				}
				cnt++;
			}
			for(int j = i + 1;  cnt < d; j++) {
				try{
					level[j]++;
				}catch(ArrayIndexOutOfBoundsException e) {
					break;
				}
				cnt++;
			}
		}
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < n; j++) {
				num[j] = level[j];
			}
			for(int j = 0; j < n; j++) {
				level[j] = 1;
			}
			for(int j = 0 ; j < n;j++) {
				d = num[j];
				cnt = 0;
				for(int t = j - 1;  cnt < d; t--) {
					try{
						level[t]++;
					}catch(ArrayIndexOutOfBoundsException e) {
						break;
					}
					cnt++;
				}
				for(int t = j + 1;  cnt < d; t++) {
					try{
						level[t]++;
					}catch(ArrayIndexOutOfBoundsException e) {
						break;
					}
					cnt++;
				}
			}
			for(int b:num) {
				System.out.print(b + " ");
			}
		}
		for(int i:num) {
			System.out.print(i + " ");
		}
	}
}