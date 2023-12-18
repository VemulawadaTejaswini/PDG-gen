import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt(); // 全て小文字へ
			int t = 0,  h = 0;
			for(int i = 0; i < n; i++) {
				String taro = sc.next();
				String hanako = sc.next();
			
				// 文字列の大小比較は compareTo
				if(taro.equals(hanako)) {
					t += 1;
					h += 1;
				}
				else if(taro.compareTo(hanako) > 0) {
					t += 3;
				}
				else {
					h +=3;
				}
			}
			System.out.println(t + " " + h);
		}
	}
}
