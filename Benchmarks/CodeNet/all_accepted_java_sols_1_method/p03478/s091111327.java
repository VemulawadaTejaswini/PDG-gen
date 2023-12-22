import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt(),b = sc.nextInt();
    int ans = 0;
    for(int i = 1;i<=n;i++){
      int sum = 0;
      int trying = i;
      while(trying > 0){
        sum += trying - (trying / 10) * 10;
        trying = trying / 10;
      }
      if(a <= sum && sum <= b){
        ans += i;
      }
    }
    System.out.println(ans);
  }
}
