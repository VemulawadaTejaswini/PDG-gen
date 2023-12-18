import java.util.*;
 
class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    long N = scanner.nextLong(); //next(文字列), nextDouble, nextLine(1行)とか
    int K = scanner.nextInt();
    long ans = 0;
    for (long i = K; i <= N+1; i++){
      long left = (i-1)*i/2;
      long right =  (N + N - i +1)*i/2;
      long num = right - left + 1;
      ans += num;
 
    }
    long z = 1000000007;
    System.out.println(ans%z);    
  }
}