import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    System.out.println(solve(n - 1));
  }

  static int solve(int n){
    if(n == 1) {
      return 1;
    }
    int ans = 0;
    for(int i = 1; i <= n; i++){
      ans += n / i;
    }
    return ans;
  }
}