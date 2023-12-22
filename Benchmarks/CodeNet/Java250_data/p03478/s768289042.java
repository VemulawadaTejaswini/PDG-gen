import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int count = 0;
    int total = 0;
    
    for(int i = 1; i <= N; i++){
      int n=i;
      count = 0;
      while(n>0){
        count += n % 10;
        n = n / 10;
      }
      if(A<=count && count<=B){
        total += i;
      }
 
    }
    System.out.println(total);
  }
}