import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int[] p = new int[n];
		for(int i=0;i<n;i++) {
			p[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(p);
		int[] cnt = new int[3];
		for(int i=0;i<n;i++) {
			if(p[i]<=a) {
				cnt[0]++;
			}else if(p[i]<=b) {
				cnt[1]++;
			}else if(b<p[i]){
				cnt[2]++;
			}
		}
		Arrays.sort(cnt);
		System.out.println(cnt[0]);
	}

}
