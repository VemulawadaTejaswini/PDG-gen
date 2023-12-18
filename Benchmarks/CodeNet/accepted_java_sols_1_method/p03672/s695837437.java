import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
        String origin = sc.next();
        String[] s = origin.split("");
        int ans = 0;
        for(int i = 0; i < s.length - 1; i++) {
          String target = s[i];
          child:for (int index = i + 1; index < s.length - 1; index++) {
            int length = index - i;
            if (length + index > s.length - 1) {
              break child;
            }
            if (target.equals(s[index])) {
              if (origin.substring(i, length + i).equals(origin.substring(index, length + index))) {
                if (ans < length) {
                  ans = length * 2;
                }
              }
            }
          }
        }

		// 出力
		System.out.println(ans);
	}
}