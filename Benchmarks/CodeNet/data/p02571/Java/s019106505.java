import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String inputS = sc.nextLine();
		String inputT = sc.nextLine();
		boolean isStop = false;;
		// 切り出す長さ
		for (int nagasa=inputT.length(); nagasa>0; nagasa--) {
			// 切り出す頭の位置
			for (int i=0; i+nagasa<=inputT.length(); i++) {
				// 検索する文字列を切り出す
				String targetStr = inputT.substring(i, i+nagasa);
				if (inputS.indexOf(targetStr) > -1
				 && inputS.indexOf(targetStr) >= i) {
					// 文字列発見
					System.out.println(inputT.length()-nagasa);
					isStop = true;
					break;
				}
			}
			if (isStop) {
				break;
			}
		}
	}
}
