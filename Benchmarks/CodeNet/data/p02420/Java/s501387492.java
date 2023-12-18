import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    boolean tmp = true;

    while(tmp){
      String s = sc.next();

      if(s.equals("-")){
        tmp = false;
        break;
      }

      int m = sc.nextInt();

      for(int i = 0; i < m; i++){
        int h = sc.nextInt();
        s = s.substring(h) + s.substring(0, h);
      }

      System.out.println(s);
    }
  }
}

