import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
        String out = "";
        if(s.equals("Sunny"))
          out = "Cloudy";
        else if(s.equals("Cloudy"))
          out = "Rainy";
        else if(s.equals("Rainy"))
          out = "Sunny";
          // 出力
		System.out.println(out);
	}
}