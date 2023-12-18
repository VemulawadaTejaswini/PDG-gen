import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
        String ans = "";
        switch (s) {
          case "Sunny" :
            ans = "Cloudy";
            break;
          case "Cloudy" :
            ans = "Rainy";
            break;
          case "Rainy" :
            ans = "Sunny";
            break;
        }
    
		// 出力
		System.out.println(ans);
	}
}