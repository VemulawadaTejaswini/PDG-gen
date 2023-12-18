import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int a = 0;
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		/*char文字を数値に変換してのバゲット法*/
		int num = 0;
		Arrays.sort(c);//ソート
		char A = 'a';//aの文字コード受け取り
		a = A;
		int[] buget = new int[26];
		for (int i = 0; i < s.length(); i++) {//文字を数値に変換してバゲット法
			buget[c[i]-a]++;//多分ここで各文字からaのコードが引かれて0~25の数になる
		}
		for (int i = 0; i < 26; i++) {//バゲットの中身を確認
			if (buget[i] == 0) {
				char ans = (char)(i+a);
				System.out.println(ans);
              	return;
			}
		}
		System.out.println("None");
	}
}
