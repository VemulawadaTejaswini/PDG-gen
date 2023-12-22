import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	//ハイフン入り
        String str = sc.next();
      	//正規表現のパターンを作成
      	Pattern p = Pattern.compile("[0-9]{"+a+"}-[0-9]{"+b+"}");
      	Matcher m = p.matcher(str);
       if (m.find()) {
            System.out.println("Yes");
        }
		else{
			System.out.println("No");
    	}
        }
}