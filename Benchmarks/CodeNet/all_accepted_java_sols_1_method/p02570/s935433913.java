import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
    int b = sc.nextInt();
    double c = sc.nextInt();

		if(a/c > b){
      System.out.println("No");
    }else{
      System.out.println("Yes");

    }
		
	}
}