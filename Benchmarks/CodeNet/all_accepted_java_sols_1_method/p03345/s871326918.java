
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long k = sc.nextLong();
    long ans =0;
    if(k%2==0){
      ans=a-b;
    }else{
      ans=b-a;
    }
    System.out.println(ans);





  }
  

  
}
