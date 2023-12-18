import java.util.Arrays;			
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[n];
		for(int i=0;i<n;i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p);
		int s = 0;
		for(int i=0;i < 4 || s >= m;i++) {
			for(int j=0;j < n || s >= m;j++) {
				while(true) {
					if(s+p[j] > m) break;
					else {
						s += p[j];
						i++;
					}
				}
			}
		}
		System.out.println(s);
	}
}
