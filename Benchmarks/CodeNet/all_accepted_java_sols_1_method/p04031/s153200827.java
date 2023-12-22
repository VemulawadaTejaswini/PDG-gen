import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner cin = new Scanner(System.in);
		String line;
		for (; cin.hasNext();) {
			line = cin.nextLine();
			int N = Integer.valueOf(line); // 整数値の個数
			line = cin.nextLine();
			String[] inputGroup = line.split(" ");  //2行目の文字列を配列に分割

			int targetNum = 0;
			for(String a : inputGroup){
				targetNum += Integer.valueOf(a);
			}
			float targetNum2 = (float)targetNum / inputGroup.length;
			targetNum = Math.round(targetNum2);

			int cost = 0;
			for(String a : inputGroup){
				cost += (Integer.valueOf(a) - targetNum) * (Integer.valueOf(a) - targetNum);
			}

			System.out.println(cost);
		}
	}
}