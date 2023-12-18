import java.util.Scanner;
public class Main {

	void doIt() {
		Scanner stdIn = new Scanner(System.in);

		while(true) {
			int limit = stdIn.nextInt();
			if(limit == 0) break;
			limit++; //漏洩情報も格納する
			int[][] member = new int[limit][];
			for(int r = 0; r < limit; r++) {
				int num = stdIn.nextInt();
				member[r] = new int[num];
				for(int c = 0; c < num; c++) {
					member[r][c] = stdIn.nextInt();
				}
			}
			int idx = -1;
			int lastLen = member[member.length - 1].length;
			boolean complete = false; //見終わった？
			for(int r = 0; r < member.length - 1; r++) {
				boolean[] check = new boolean[lastLen];
				boolean flag = false; //見つかった？
				for(int c = 0; c < member[r].length; c++) {
					for(int k = 0; k < lastLen; k++) {
						if(member[member.length - 1][k] == member[r][c]) {
							check[k] = true;
						}
					}
					for(int k = 0; k < lastLen; k++) {
						if(!check[k]) {
							flag = false;
							break;
						}
						flag = true;
					}
					if(flag) {
						if(!complete) {
							idx = r + 1;
							complete = true;
						} else {
							idx = -1;
						}
					}
				}
			}
			System.out.println(idx);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}