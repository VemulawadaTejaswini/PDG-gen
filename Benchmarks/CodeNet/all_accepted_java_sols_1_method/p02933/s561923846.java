import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		String s = sc.next();
      	if(a >= 3200){
          System.out.println(s);
        }
        else
        {
          System.out.println("red");
        }
      
	}
}