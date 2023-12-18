import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int n = sc.nextInt();
    int ans = 0;

    if(d == 0){
      if(n < 100){ans = n;}
      else{ans = n + 1;}
    }else if(d == 1){
      if(n < 100){ans = 100 * n;}
      else{ans = 100 * 101;}
    }else{
      if(n < 100){ans = 10000 * n;}
      else{ans = 10000 * 101;}
    }

    System.out.println(ans);
  }
}
