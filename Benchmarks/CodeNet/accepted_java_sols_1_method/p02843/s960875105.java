import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = N/100;
    int B = N%100;
    int ans = 0;
    if(A != 0){
      if((double)B/A <= 5){
        ans = 1;
      }
    }
    System.out.println(ans);
  }
}