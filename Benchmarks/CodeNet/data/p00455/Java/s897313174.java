import java.util.Scanner;
public class Main {
	int time = 60;
	final static int numPerson = 3;
	
	static int[] calcTime(int[] after, int[] before) {
		int[] ans = new int[3];
		
		for(int r = 0; r < ans.length; r++) {
			ans[r] = after[r] - before[r];
		}
		int secCheck = 0, minCheck = 0;
		if(ans[2] < 0) {
			ans[2] += 60;
			secCheck = -1;
		}
		ans[1] += secCheck;
		if(ans[1] < 0) {
			ans[1] += 60;
			minCheck = -1;
		}
		ans[0] += minCheck;
		
		return(ans);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] ans = new int[numPerson][];
		for(int k = 0; k < numPerson; k++) {
			int[] before = new int[3];
			int[] after = new int[3];
			for(int r = 0; r < 2; r++) {
				for(int c = 0; c < 3; c++) {
					if(r == 0) before[c] = stdIn.nextInt();
					else       after[c]  = stdIn.nextInt();
				}
			}
			ans[k] = calcTime(after, before);
		}
		for(int r = 0; r < numPerson; r++) {
			for(int c = 0; c < 3; c++) {
				System.out.print(ans[r][c]);
				System.out.print((c == 2) ? '\n' : ' ');
			}
		}
	}
	
}