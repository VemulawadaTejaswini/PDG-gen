import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;
    int sum = 0;
    for(int cnt = 0; cnt <= n; cnt++){
      int tmp = cnt;
      while(tmp != 0){
        sum += tmp % 10;
        tmp /= 10; 
      }
      if ( a <= sum && sum <= b){
        ans+= cnt;
      }
      sum = 0;
      tmp = 0;
    }
    System.out.println(ans);
    sc.close();
  }
}