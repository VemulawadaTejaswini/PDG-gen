import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    int c = x/105;
    boolean flag = false;

    while(flag == false){
      if(c==1000000){
        break;
      }
      if(100*c<=x&&105*c>=x){
        flag = true;
      }else{
        c += 1;
      }
    }

    if(flag){
      System.out.println("1");
    }else{
      System.out.println("0");
    }



  }
}