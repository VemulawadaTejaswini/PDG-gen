import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String[] s = sc.next().split("");
        int count = 0;
        for(String n : s) {
          if ("o".equals(n)) {
            count++;
          }
        }
      
		// 出力
		System.out.println(700 + count * 100);
	}
}
