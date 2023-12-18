import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int numCntst, winNum, dedRate, pool, total;
		List<Integer> voteList = new ArrayList<Integer>();

		for(;;){
			pool = total = 0;

			numCntst = sc.nextInt();
			winNum = sc.nextInt();
			dedRate = sc.nextInt();
			if(numCntst == 0) break;

			for(int i = 0; i < numCntst; i++){
				voteList.add(sc.nextInt());
			}

			for(int i = 0; i < numCntst; i++){
				pool += 100 * voteList.get(i);
			}
			total = pool * (100 - dedRate)/ 100;

			if(voteList.get(winNum - 1) == 0) System.out.println(0);
			else System.out.println(total / voteList.get(winNum - 1));

			voteList.clear();
		}
	}

}