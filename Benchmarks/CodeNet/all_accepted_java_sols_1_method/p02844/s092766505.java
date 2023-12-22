import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    int ans = 0;
    for(int sec = 0; sec < 1000; sec++) {
      int count = 0, tmp = sec;
      for(int i = 0; i < N; i++) {
        if(S.charAt(N - 1 - i) - '0' == tmp % 10) {
          tmp = tmp / 10;
          count++;
        }
        if(count == 3) {
          ans += 1;
          break;
        }
      }
    }
    System.out.println(ans);
  }
}