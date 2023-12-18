import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String[] s = sc.next().split("");
        List<String> sList = Arrays.asList(s);
        String ans = "yes";
        for (int i = 0; i < s.length; i++) {
          if (sList.indexOf(sList.get(i)) != i) {
            ans = "no";
            break;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}