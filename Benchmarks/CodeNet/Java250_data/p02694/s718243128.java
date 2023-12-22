import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    long N = Long.parseLong(sc.nextLine());
    
    int ans = 0;
    long m = 100;
    while(m < N){
      m += (long)(m*0.01);
      ans++;
    }
    System.out.println(ans);
  }
}