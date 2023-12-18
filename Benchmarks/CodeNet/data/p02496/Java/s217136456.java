import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int i,j,midx,rank;
		String mark;
		int[][]cards = new int[4][13];
		int n = sc.nextInt();
		for(i = 0; i < n; i ++) {
			mark = sc.next();
			rank = sc.nextInt();
			if (mark.equals("S")) midx = 0;
			else if (mark.equals("H")) midx = 1;
			else if (mark.equals("C")) midx = 2;
			else midx = 3;
			cards[midx][rank -1] = 1;
		}
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 13; j++) {
				if(cards[i][j] == 0) {
					if(i == 0) mark = "S";
					else if(i == 1) mark = "H";
					else if(i == 2) mark = "C";
					else mark = "D"; 
					rank = j + 1;
					System.out.println(mark+" "+rank);
				}
			}
		}	
	}
}