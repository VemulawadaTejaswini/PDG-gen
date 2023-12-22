import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int q = stdIn.nextInt();
			if(n == 0 && q == 0) break;
			int[] list = new int[101];
			for(int i = 0; i < n; i++) {
				int m = stdIn.nextInt();
				for(int j = 0; j < m; j++) {
					list[stdIn.nextInt()]++;
				}
			}
			int max = 0;
			int id = 0;
			for(int i = 0; i < 101; i++) {
				if(list[i] > max) {
					max = list[i];
					id = i;
				}
			}
			if(max < q) {
				System.out.println(0);
			}
			else {
				System.out.println(id);
			}
		}
	}
 }