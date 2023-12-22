import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 		// 整数の入力
    int a = sc.nextInt();
    boolean f = false;
    if(a <= 81){
      for(int i = 2; i < 10; i++){
        if(a % i == 0 && a / i < 10){
          System.out.println("Yes");
          f = true;
          break;
        }
      }
    }else{
      f = true;
      System.out.println("No");
 	}
  	if(f == false)
      if(a == 1){
        System.out.println("Yes");
      }else
        System.out.println("No");
 }
}
