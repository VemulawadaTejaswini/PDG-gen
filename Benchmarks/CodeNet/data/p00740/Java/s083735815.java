import java.util.*;
public class Main {
	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			if (n ==0 && p ==0) break;
			int tmp = p;
			int[] sto = new int[n];
			int ans;
			
			for (int i=0;i<n;i++) sto[i] = 0;
			
			for (int i=0;;i++) {
//				System.out.println(i + " " + p);
//				for (int j=0;j<n;j++) System.out.print(sto[j]);
//				System.out.println();
				if(tmp != 0) {
					sto[i] += 1;
					tmp -= 1;
					
				}
				else {
					tmp = sto[i];
					sto[i] = 0;
				}
				if(sto[i] == p) {
					ans = i;
					break;
				}
				
				if (i==n-1) i=-1;
				
			}
			System.out.println(ans);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}