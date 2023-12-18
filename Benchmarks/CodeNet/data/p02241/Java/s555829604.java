import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int edgeCnt = Integer.parseInt(s.nextLine());
		int[][] input = new int[edgeCnt][edgeCnt];
		for(int i=0 ; i<edgeCnt ; i++) {
			String[] tmp = s.nextLine().split(" ");
			int[] inner = new int[tmp.length];
			for(int j=0 ; j<tmp.length ; j++) {
				inner[j] = Integer.parseInt(tmp[j]);
			}
			input[i] = inner;
		}
		int result = 0;
		boolean[] alreadyVisit = new boolean[edgeCnt];
		alreadyVisit[0] = true;

		while(true) {
			int min = Integer.MAX_VALUE;
			boolean flg = false;
			int direction = -1;
			flg = false;
			for(boolean value : alreadyVisit) {
				if(!value) {
					flg = true;
				}
			}
			if(!flg)
				break;
			for(int i=0 ; i<edgeCnt ; i++) {
				if(alreadyVisit[i]) {
					for(int j=0 ; j<edgeCnt ; j++) {
						if(min>input[i][j] && !alreadyVisit[j] && input[i][j]!=-1) {
							min = input[i][j];
							direction = j;
						}
					}
				}
			}
			result += min;
			alreadyVisit[direction] = true;
		}
		System.out.println(result);
	}

}