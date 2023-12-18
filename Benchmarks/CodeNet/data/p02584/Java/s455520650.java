import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long now = sc.nextLong();
    long num = sc.nextLong();
    long move = sc.nextLong();
    boolean flag = false;
    for(int i = 0;i < num;i++){
      if(now > 0){
        now -= move;
        if(now <= 0){
          if((num - i) % 2 != 0){
            now *= -1;
            flag = true;
          }
          else{
            now += move;
            flag = true;
          }
        }
      }
      else if(now < 0){
        now += move;
        if(now >= 0){
          if((num - i) % 2 != 0){
            flag = true;
          }
          else{
            now -= move;
            flag = true;
          }
        }
      }
      else{
          if((num - i) % 2 == 0){
              flag = true;
          }
          else{
              now = move;
              flag = true;
          }
      }
      if(flag){
        break;
      }
    }
    System.out.println(now);
  }
}