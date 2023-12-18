/* 文字列の辞書順で一番前に来る単語を表示 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int size = scan.nextInt(); // 文字列の数 
	String top_str = scan.next(); // 先頭に来る文字列
	
	for (int i=1; i<size; i++) {
	    String tmp_str = scan.next();
	    if (top_str.compareTo(tmp_str) > 0) 
		top_str = tmp_str;
	}
	System.out.println(top_str);
    }
}