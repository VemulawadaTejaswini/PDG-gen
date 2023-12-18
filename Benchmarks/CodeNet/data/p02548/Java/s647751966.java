import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // int型へ変換
    var N = Integer.parseInt(str_scan);
    int AxB = 0;
    int max = N / 2;
    int ans = 0;
    int kasan = N - max;

    for (var i = 1;i <= max;i++){
      for (var j = 1; j <= max;j++){

        AxB=i*j;

        if (AxB < N){
          ans++;
        }else{
          break;
        }
      }
    }

    ans = ans + kasan + kasan - 2;

    System.out.println(ans);
    scan.close();
  }
}