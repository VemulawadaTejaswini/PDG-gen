import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int i,j,rank;
		String m;
		String mark = "SHCD";
		int[][]cards = new int[4][13];
		int n = sc.nextInt();
		for(i = 0; i < n; i++) {
			m = sc.next();
			rank = sc.nextInt();
			for(j = 0; j < 4; j++) {
				if(m.equals(mark.charAt(j))) {
					cards[j][rank -1] = 1;
					break;
				}
			}
		}
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 13; j++) {
				if(cards[i][j] == 0) {
					System.out.printf("%s %d\n",mark.charAt(i),j + 1);
				}
			}
		}	
	}
}