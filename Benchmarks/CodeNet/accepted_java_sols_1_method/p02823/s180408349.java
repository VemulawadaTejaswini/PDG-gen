import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    long N = scan.nextLong();
    long A = scan.nextLong();
    long B = scan.nextLong();
    
    if((B - A) % 2 == 0){
      System.out.println((long)((B - A) / 2));
    }else{
      if(B-1 < N-A){
        System.out.println(A + (long)((B - A) / 2));
      }else{
        System.out.println(N-B + 1 + (long)((B - A) / 2));
      }
    }
  }
}