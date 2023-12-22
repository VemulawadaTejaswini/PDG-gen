import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String[] lineString = sc.nextLine().split(" ");
		int[] sunuke = new int[Integer.parseInt(lineString[0])];
		int numberOfCandy = Integer.parseInt(lineString[1]);

		int noCandyCount = sunuke.length;
		for (int candy = 0; candy < numberOfCandy; candy++) {
			int hasCandy = Integer.parseInt(sc.nextLine());
			lineString = sc.nextLine().split(" ");
			while (hasCandy-- > 0) {
				if (sunuke[Integer.parseInt(lineString[hasCandy]) - 1] == 0) {
					noCandyCount--;
				}
				sunuke[Integer.parseInt(lineString[hasCandy]) - 1]++;
			}
		}

		// 出力
		System.out.println(noCandyCount);
		sc.close();
	}
}
