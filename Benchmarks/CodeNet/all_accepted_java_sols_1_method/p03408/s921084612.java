import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		String[]S = new String[N];
		int[] Snum =  new int[N];
		S[0] = keyboard.next();	
		Snum[0] = 1;
		int blankcount = 0;
		for (int s=1; s<N; s++) {
			String Sin = keyboard.next();
			int flag = 0;
			for(int ss = 0; ss<=blankcount; ss++) {
				if(S[ss].contentEquals(Sin)) {
					Snum[ss]++;
					flag ++;
				}
			}
			if(flag == 0) {
					S[blankcount+1] = Sin;
					Snum[blankcount+1]++;
					blankcount++;
			}
		}
		
		int M = keyboard.nextInt();
		for (int t=0; t<M; t++) {
			String Tin = keyboard.next();	
			for(int n= 0; n<=blankcount; n++) {
				if(Tin.contentEquals(S[n])) {
					Snum[n]--;
					break;
				}
			}
		}
		
		int ans = 0;
		for (int a =0; a<N; a++) {
			if(ans<= Snum[a]) {
				ans = Snum[a];
			}
		}
		
		if(ans < 0) {
			ans = 0;
		}
				
		System.out.println(ans);
		keyboard.close();
	}
	
}
