
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();

		double totalVote = 0;

		// 商品の投票数
		List<Integer> voteList = new ArrayList();

		// 投票数リスト作成
		for(int i = 0; i < N; i++) {
			voteList.add(scan.nextInt());
		}
		// 降順ソート
		Collections.sort(voteList, Collections.reverseOrder());

//		for(int i = 0; i < voteList.size(); i++) {
//			// System.out.println(voteList.get(i));
//			totalVote += (int)voteList.get(i);
//		}
		for(int i :voteList) {
			totalVote += i;
		}

		// 総評数
		//System.out.println(totalVote);

		if((int)voteList.get(M-1) >= totalVote/(4 * M)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}