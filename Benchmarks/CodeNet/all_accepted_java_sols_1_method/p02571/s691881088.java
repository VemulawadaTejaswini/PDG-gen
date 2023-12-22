import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String inputS = sc.nextLine();
		String[] inputT = sc.nextLine().split("");
		int minReplaceCount = inputT.length;
		// 切り出す頭の位置
		for (int i=0; i+inputT.length<=inputS.length(); i++) {
			// 検索する文字列を切り出す
			String[] targetStr = inputS.substring(i, i+inputT.length).split("");
			int replaceStrCount = 0;
			for (int j=0; j<targetStr.length; j++) {
				if (!targetStr[j].equals(inputT[j])) replaceStrCount++;
			}
			if (minReplaceCount > replaceStrCount) minReplaceCount = replaceStrCount;
		}
		System.out.println(minReplaceCount);
	}
}
