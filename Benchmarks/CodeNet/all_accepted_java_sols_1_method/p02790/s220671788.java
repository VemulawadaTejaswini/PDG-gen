import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		// 文字列の入力
      String buf="";
      if (a > b) {
        for (int i=0; i < a;i++){
			buf+=b;
        }
      } else {
        for (int i=0; i < b;i++){
			buf+=a;
        }
      }
      		System.out.println(buf);


	}
}