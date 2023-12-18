import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] c = s.toCharArray();
		//char配列をリストに変換する
		List<Character> list = new ArrayList<Character>();
		for (char i : c) {
			list.add(i);
		}
		List<Character> list2 = new ArrayList<Character>(new HashSet<>(list));
		if(list.size()==list2.size()) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
