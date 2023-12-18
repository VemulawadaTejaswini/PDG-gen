import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int k = stdIn.nextInt();

		List<Integer> brightnessList = IntStream.range(0, n).mapToObj(i -> stdIn.nextInt()).collect(Collectors.toList());

		LampStreet street = new LampStreet(brightnessList);

		for (int i = 0; i < k; i++) {
			if(street.execute()) {
				break;
			}

		}
		street.print();

		stdIn.close();
	}
}

class LampStreet {

	private List<Integer> lampList;

	public LampStreet(List<Integer> lampList) {
		this.lampList = lampList;
	}

	public boolean execute() {
		List<Integer> newLampList = new ArrayList<>();

		//範囲の配列を作成する
		int[][] rangeArray = new int[lampList.size()][2];
		for (int i = 0; i < rangeArray.length; i++) {
			rangeArray[i][0] = i - lampList.get(i);//0始まり読み替え
			rangeArray[i][1] = i + lampList.get(i);
		}


		int minCnt = lampList.size();
		for (int i = 0; i < lampList.size(); i++) {

			int cnt = 0;
			for (int j = 0; j < rangeArray.length; j++) {
				if(rangeArray[j][0] <= i && i <= rangeArray[j][1]) {
					cnt++;
				}
			}

			newLampList.add(cnt);
			minCnt = Integer.min(minCnt, cnt);
		}

		lampList = newLampList;

		return minCnt == lampList.size();
	}

	public void print(){
		StringJoiner sj = new StringJoiner(" ");
		for (Integer lamp : lampList) {
			sj.add(lamp.toString());
		}

		System.out.println(sj.toString());
	}

}