import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    boolean flag = false;
    int N = sc.nextInt();
    for(int i=0;i<N;i++){
      String s = sc.next();
      if(s.equals("Y")){
        flag = true;
      }
    }
    if(flag){
      System.out.println("Four");
    }else{
      System.out.println("Three");
    }

  }
}
