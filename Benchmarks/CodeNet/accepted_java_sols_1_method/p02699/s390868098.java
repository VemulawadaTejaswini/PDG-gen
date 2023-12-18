import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int s = sc.nextInt();
        int w = sc.nextInt();
      
      	String result;
      
      if(w >= s){
        result = "unsafe";
      } else {
        result = "safe";
      }
      
		// 文字列の入力
		System.out.println(result);
	}
}