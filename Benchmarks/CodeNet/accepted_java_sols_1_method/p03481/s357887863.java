
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long Y = sc.nextLong();
    long tmp=X;
    long ans =0;
    while(tmp<=Y){

      tmp=tmp*2;
      ans++;
    }
    System.out.println(ans);

  }

  
}
