import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		// 文字列の入力
		String s = sc.next();
      char threend = s.charAt(2);
      char fourth = s.charAt(3);
      char fiveth = s.charAt(4);
      char sixth = s.charAt(5);
      
      if ((threend == fourth) && (fiveth == sixth))
		// 出力
      {
		System.out.println("Yes");
      }
      else
      {
      System.out.println("No");
      }
	}
}