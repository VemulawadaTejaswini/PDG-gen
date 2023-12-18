import java.util.*;
import java.util.Random;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 名前の入力
		String s = sc.next();
                // 名前のサイズ（−3）を取得
                int sLength = s.length() - 3;
                // 文字列取得の開始位置を指定
                Random random = new Random(); 
                int start = random.nextInt(sLength); 
                // 開始位置から3文字取得
                String s1 = String.valueOf(s.charAt(start));
                String s2 = String.valueOf(s.charAt(start + 1));
                String s3 = String.valueOf(s.charAt(start + 2));
		// 三文字結合して出力
		System.out.println(s1 + s2 + s3);
	}
}