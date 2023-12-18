
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		int [][]p = new int [k][2];
		int r = 1;
		int l = k+1;
		int r0 = k+2;
		int l0 = 2* k +1;
		int cnt = 0;
		for(int i = k ; i >= 1 ;i--) {
			if(cnt % 2 == 0) {
				p[k-i][0] = r;
				p[k-i][1] = l;
				r++;
				l--;
			}
			else {
				p[k-i][0] = r0;
				p[k-i][1] = l0;
				r0++;
				l0--;
			}
			cnt++;
		}
		for(int i = 0 ;i < k ;i++) {
			System.out.println(p[i][0]+" "+p[i][1]);
		}

	}

}
