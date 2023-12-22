import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[] s = sc.next().toCharArray();
		
		int[] t = new int[N+1];
		int idx = N;
		int turn = 1;
		while(idx>0) {
			boolean ok = false;
			int next = idx;
			for(int i=0; i<M; i++) {
				if(idx-i-1>=0) {
					if(s[idx-i-1]=='0') {
						ok = true;
						t[idx]=turn;
						next = idx-i-1;
					}
				}
			}
			if(!ok) {
				System.out.println(-1);
				sc.close();
				return;
			}
			turn++;
			idx = next;
		}
		turn--;
		
		idx = 0;
		for(int i=0; i<turn; i++) {
			for(int j=1; j<=M; j++) {
				if(t[idx+j]==turn-i) {
					pw.print(j+(i==turn-1 ? "\n" : " "));
					idx += j;
					break;
				}
			}
		}
//		System.out.println(turn);
		sc.close();
		pw.close();
	}
	
}