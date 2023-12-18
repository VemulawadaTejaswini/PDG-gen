import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int flag = 0;
      if(a%2==0||b%2==0){
        flag = 1;
      }
		// 出力
      if(flag==0){
		System.out.println("Odd");
	}else{
        System.out.println("Even");
      }
      }
}