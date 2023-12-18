import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int s[] = new int[n];
		int t[] = new int[n];
		int cs[] = new int[n];
		for(int i=0; i<n; i++) {
			s[i] = sc.nextInt();
			t[i] = sc.nextInt();
			cs[i] = sc.nextInt();
		}
		sc.close();
		int len = 0;
		for(int i=0; i<t.length; i++) {
			if(len < t[i]) len = t[i];
		}
		int ary1[] = new int[len*2+2]; //0.5を考慮するため*2
		int ary2[] = new int[len*2+2];
		
		for(int i=1; i<=c; i++) {
			Arrays.fill(ary1, 0);
			for(int j=0; j<n; j++) {
				if(cs[j] == i) {
					ary1[s[j]*2-1]++;
					ary1[t[j]*2]--; // T除く
				}
			}
			for(int j=1; j<ary1.length; j++) {
				ary1[j] += ary1[j-1];
			}
			for(int j=0; j<ary1.length; j++) {
				if(ary1[j] > 0) ary2[j]++;
			}
		}
		
		int ans = 0;
		for(int i=0; i<ary2.length; i++) {
			if(ans < ary2[i]) ans = ary2[i];
		}
		
		System.out.println(ans);
	}

}