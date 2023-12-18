import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    long K = scan.nextLong();
    long[] num = new long[100001];
    
    for(int i = 0; i < N; i++){
      int A = scan.nextInt();
      int B = scan.nextInt();
      num[A] += B;
    }
    
    long n = 0;
    int ans = 0;
    for(int i = 1; i < 100001; i++){
      n += num[i];
      if(n >= K){
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}