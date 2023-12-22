import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for(int i = 0; i < s.length() - t.length() + 1; i++) {
			String temp = s.substring(i, i + t.length());
			for(int j = 0; j < t.length(); j++) {
				if(temp.charAt(j) != t.charAt(j)) {
					count++;
				}
			}
			list.add(count);
			count = 0;
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}

}
