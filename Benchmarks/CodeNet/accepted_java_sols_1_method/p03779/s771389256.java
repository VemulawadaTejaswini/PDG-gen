import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int dis = 0;
    int now;
    for(int i = 1;;i++){
      now = i;
      dis += i;
      if(dis >= x){
        break;
      }
    }
    System.out.println(now);
  }
}
