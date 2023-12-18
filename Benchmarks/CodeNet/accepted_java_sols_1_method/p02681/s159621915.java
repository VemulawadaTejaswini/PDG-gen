import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String T = sc.next();
      
      //末尾から1文字分を削除
      String T_S = T.substring(0, T.length()-1);
      
      if ( S.equals(T_S))
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}