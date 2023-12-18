import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      // 準備
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int ans = 0;
      int n1000 = 1000;

      // 解く
      ans = n % n1000;

      if(ans != 0 )
        ans = n1000 % ans;

      System.out.println(ans);
    }
}