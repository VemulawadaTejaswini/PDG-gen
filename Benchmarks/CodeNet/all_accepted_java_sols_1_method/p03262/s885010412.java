import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String lineStr1 = scan.nextLine();
		String lineStr2 = scan.nextLine();
		scan.close();
		
		String[] splitStr1 = lineStr1.split(" ");
		int N = Integer.parseInt(splitStr1[0]);
		int X = Integer.parseInt(splitStr1[1]);
		
		String[] splitStr2 = lineStr2.split(" ");
		int len = splitStr2.length;
		int[] cityList = new int[len];
		
		for (int i = 0 ; i < len ; i++) {
			cityList[i] = Integer.parseInt(splitStr2[i]);
		}
		
		int[] diffList = new int[len];
		int miniDiff = 1000000000;
		for (int j = 0 ; j < len ; j++) {
			int diff = Math.abs(X - cityList[j]);
			diffList[j] = diff;
			if (miniDiff > diff) {
				miniDiff = diff;
			}
		}
		
		for (int k = miniDiff ; k > 0 ; k--) {
			boolean flg = false;
			for (int l = 0 ; l < len ; l++) {
				if (diffList[l] % k != 0) {
					flg = true;
					break;
				}
			}
			if (!flg) {
				System.out.print(k);
				return;
			}
		}
	}
}
