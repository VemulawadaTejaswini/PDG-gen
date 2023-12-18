import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int a_speed = sc.nextInt();
    int b = sc.nextInt();
    int b_speed = sc.nextInt();
    int time = sc.nextInt();
    boolean flag = false;
    for(int i = 0;i < time;i++){
      if(a < b){
        a += a_speed;
        b += b_speed;
      }
      else{
        a -= a_speed;
        b -= b_speed;
      }
      if(a == b){
          flag = true;
      }
    }
    if(flag){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
}