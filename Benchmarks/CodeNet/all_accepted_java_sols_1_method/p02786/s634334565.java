import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    int count = 0;
    long ans = 0;

    while(h>0){
      h = h/2;
      count++;
    }
    
    for(int i = 0 ; i < count ; ++i){
        ans += (long)Math.pow(2,i);
    }
        
    System.out.println(ans);

  }
}