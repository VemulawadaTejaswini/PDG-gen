import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 出力
      if ((a>0 &&a<10) && (b>0 && b<10)){
		System.out.println(a*b);
      }else{
		System.out.println("-1");
      }
   }
}

