import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int kotae = n%2;
      if(kotae == 0){
        System.out.println(n/2);
      }else{
        System.out.println(n/2+1);
      }
  }  
}
