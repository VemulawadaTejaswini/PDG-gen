import java.util.Scanner;


public class Main{

	static int[][] ban;
	static boolean[] fix;
	static boolean flg = false;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());
		ban = new int[8][8];
		fix = new boolean[8];
		for(int i=0 ; i<cnt ; i++) {
			String[] tmp = s.nextLine().split(" ");
			ban[Integer.parseInt(tmp[1])][Integer.parseInt(tmp[0])] = 1;
			fix[Integer.parseInt(tmp[1])] = true;
		}
		solve(ban, fix);

		for(int i=0 ; i<8 ; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j=0 ; j<8 ; j++) {
				if(ban[j][i]==0)
					sb.append(". ");
				else
					sb.append("Q ");
			}
			System.out.println(sb.toString().trim());
		}
	}

	public static void solve(int[][] ban, boolean[] fix) {
		put(0);
	}

	public static void put(int index) {

		if(index==8){
			flg = true;
			return;
		}

		if(fix[index])
			put(index+1);
		else {
		outer : for(int i=0 ; i<8 ; i++) {
			for(int j=0 ; j<8 ; j++) {
				if(index!=j) {
					if(ban[j][i]==1)
						continue outer;
				}
			}
			int record = i;
			for(int k=index+1 ; k<8 ; k++) {
				record++;
				if(k<8 && record<8) {
					if(ban[k][record]==1)
						continue outer;
				}
			}

			record = i;
			for(int l=index+1 ; l<8 ; l++) {
				record--;
				if(l<8 && record>=0) {
					if(ban[l][record] == 1)
						continue outer;
				}
			}
			record = i;
			for(int m=index-1 ; m>=0 ; m--) {
				record++;
				if(m>=0 && record<8) {
					if(ban[m][record]==1)
						continue outer;
				}
			}
			record = i;
			for(int n=index-1 ; n>=0 ; n--) {
				record--;
				if(n>=0 && record>=0) {
					if(ban[n][record]==1)
						continue outer;
				}
			}
			ban[index][i] = 1;
			put(index+1);
			if(!fix[index] && !flg)
				ban[index][i] = 0;
		}
		}
	}
}