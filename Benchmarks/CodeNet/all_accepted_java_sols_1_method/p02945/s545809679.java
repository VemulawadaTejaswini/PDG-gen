import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int max=a+b;
      	if(max<a*b)max=a*b;
      if(max<a-b)max=a-b;
          
		// 出力
		System.out.println(max);
	}
	

}