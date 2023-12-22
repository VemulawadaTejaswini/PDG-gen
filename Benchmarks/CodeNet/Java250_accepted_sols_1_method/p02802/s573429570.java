import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int problemCount = sc.nextInt();
		int teisyutuCount = sc.nextInt();

		int seitoCount = 0;
		int penaltyCountTotal = 0;

		boolean[] seitoList = new boolean[problemCount];
		int[] penaltyCount = new int[problemCount];

		for(int i =0;i < problemCount; i++) {
			seitoList[i] = false;
			penaltyCount[i] = 0;
		}

		for(int i = 0;i < teisyutuCount; i++) {
			int problemNo = sc.nextInt();
			String result = sc.next();

			if(seitoList[problemNo -1]) {
				// すでに正解している場合は何もしない
				continue;
			}else if(result.equals("AC")) {
				// 初めて正解した場合
				seitoCount++;
				seitoList[problemNo-1] = true;
				// これまでの不正解数を加える
				penaltyCountTotal += penaltyCount[problemNo-1];
			}else {
				// 不正解の場合
				penaltyCount[problemNo-1]++;
			}
		}

		System.out.println(seitoCount + " " + penaltyCountTotal);
	}
}
