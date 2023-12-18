import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        int ans;
      
        if(op.equals("+")){
          ans = a + b;
        }else{
          ans = a - b;
        }
        System.out.println(ans);
    }
}