import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String numberArray1 = "";  //1～n-1の数字が順に格納された数列リスト
		String numberArray2 = "";  //比較する数列リスト

		for(int i = 1; i <= n; i++) {
			numberArray1 += String.valueOf(i);
			numberArray2 += String.valueOf(sc.nextInt());
		}

		List<String> numberList = new ArrayList<String>();
		permutation(numberArray1, "", numberList);

		for(int i = 0; i < numberList.size(); i++) {
			if(numberList.get(i).equals(numberArray2)) {
				if(i != 0) display(numberList.get(i-1));
				display(numberArray2);
				if(i != numberList.size() - 1) display(numberList.get(i+1));
				break;
			}
		}
	}

	public static List<String> permutation(String s, String ans, List<String> list) {
		if(s.length() <= 1) {
			list.add(ans + s);
		}
		else {
			for(int i = 0; i < s.length(); i++) {
				permutation(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i), list);
			}
		}

		return list;
	}

	//String型を引数としそれを空白を開けて表示するメソッド
	public static void display(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(i != 0) System.out.print(" ");
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}

}

