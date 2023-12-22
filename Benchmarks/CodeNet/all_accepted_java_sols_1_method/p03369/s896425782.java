import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
        String s = sc.next();
        int value = 700;
        sc.close();

        if(s.charAt(0) == 'o') value += 100;
        if(s.charAt(1) == 'o') value += 100;
        if(s.charAt(2) == 'o') value += 100;

		// 出力
		System.out.println(value);
	}
}
