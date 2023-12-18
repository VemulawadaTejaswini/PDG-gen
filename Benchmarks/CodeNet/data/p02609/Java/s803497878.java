import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = sc.next();

		int[]x = new int[n];

		for (int i=0; i<n; i++){
			x[i] = s.charAt(i) - '0';
		}

		int pc =0;
		for (int i=0; i<n; i++){
			if (x[i] == 1){
				pc++;
			}
		}

		int[] ans = new int[n];
		int[] f = new int[n];
		for (int i=0; i<2; i++){


			int npc;
			if (i == 0) {
				npc = pc +1;
			} else {
				npc = pc -1;
			}
			if (npc <= 0){
				continue;
			}
			int r0=0;
			for (int k=0; k<n; k++){
				r0 = (r0*2) % npc;
				r0 += x[k];
			}
			int l = 1;
			for (int j=n-1; j>=0 ; j--){
				if (x[j] == i){
					int r = r0;
					if (i == 0) {
						r = (r + l) % npc;
					} else {
						r = (r - l + npc) % npc;
					}
					ans[j] = f(r) + 1;
				}
				l = (l*2) % npc;
			}
		}
		for (int i=0; i<n; i++){
			System.out.println(ans[i]);
		}
	}

	public static int f(int n){

		if (n == 0){
			return 0;
		}
		return f(n % pcnt(n)) + 1;

	}

	public static int pcnt(int n){
		String b = Integer.toBinaryString(n);
		int ret = 0;
		for (int i=0; i<b.length(); i++){
			if (b.charAt(i) == '1'){
				ret ++;
			}
		}
		return ret;
	}

}
