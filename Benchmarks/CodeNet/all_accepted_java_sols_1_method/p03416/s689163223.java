import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    int ans = 0;
    for(int i = A; i <= B; i++){
      int n = i;
      int j =0 ;
      j += (n%10) * 10000;
      n /= 10;
      j += (n%10) * 1000;
      n /= 10;
      j += (n%10) * 100;
      n /= 10;
      j += (n%10) * 10;
      n /= 10;
      j += n%10;
      
      if(i == j){
        ans++;
      }
    }
    System.out.println(ans);
  }
}