import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String[] str = s.split("");

		//配列をリストに変換
		List<String> listA=Arrays.asList(str);
		//重複した値を削除
		List<String> listB = new ArrayList<String>(new HashSet<>(listA));

		if(listA.size() == listB.size()) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
