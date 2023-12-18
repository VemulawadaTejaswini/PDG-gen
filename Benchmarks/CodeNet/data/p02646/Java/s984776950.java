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
    for(int i = 1;i <= time;i++){
      if(a + (a_speed * i) == b + (b_speed * i)){
        flag = true;
      }
    }
    if(flag){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}