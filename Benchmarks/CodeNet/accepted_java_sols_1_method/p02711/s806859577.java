import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
	  String n = sc.next();
      
      if(n.contains("7")){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }     
}
