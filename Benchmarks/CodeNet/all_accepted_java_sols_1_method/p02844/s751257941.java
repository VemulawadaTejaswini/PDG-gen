import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		String S = stdIn.next();
		char[] c = S.toCharArray();
		boolean[][] flag = new boolean[10][11];
		boolean[] count = new boolean[1000];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 11; j++) {
				flag[i][j]=false;
			}
		}
		int ans = 0;
		
		for(int i = 0; i < N-2; i++) {
			if(!flag[c[i]-48][10]) {
				flag[c[i]-48][10]=true;
				for(int j = i+1; j < N-1; j++) {
					if(!flag[c[i]-48][c[j]-48]) {
						flag[c[i]-48][c[j]-48]=true;
						for(int k = j+1; k < N; k++) {
							int temp = (c[i]-48)*100+(c[j]-48)*10+(c[k]-48);
							count[temp]=true;
						}
					}
				}
			}
		}
		
		for(int i = 0; i < 1000; i++) {
			if(count[i]) ans++;
		}
		
		System.out.println(ans);

	}

}