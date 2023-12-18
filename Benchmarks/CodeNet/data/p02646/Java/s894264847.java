import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int a_speed = sc.nextInt();
    int b = sc.nextInt();
    int b_speed = sc.nextInt();
    int time = sc.nextInt();
    if(a_speed < b_speed){
      System.out.println("NO");
    }
    else{
      int dis = b - a;
      if((a_speed - b_speed) * time > dis){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
    }
  }
}