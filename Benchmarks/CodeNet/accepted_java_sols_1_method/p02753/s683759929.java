import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      //取得
      String S = sc.next();
      //文字列比較
     if(S.equals("AAA") || S.equals("BBB")){
       System.out.println("No");
     }else{
       System.out.println("Yes");
     }
    }
}