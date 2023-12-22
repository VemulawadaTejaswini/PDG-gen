import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    long N = Long.parseLong(sc.nextLine());
    long min = N;
    for(int i = 0; i < 5; i++){
      long n = Long.parseLong(sc.nextLine());
      if(n < min){
        min = n;
      }
    }
    
    long ans = 0;
    if(min == N){
      ans = 5;
    }else{
      ans = N/min + 4;
      if(N%min != 0){
        ans++;
      }
    }
    System.out.println(ans);
  }
}