import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    boolean[] hasSunuke = new boolean[N];
    for(int i = 1;i <= K;i++) {
      int di = sc.nextInt();
      for(int j = 0;j < di;j++) {
        int a = sc.nextInt();
        hasSunuke[a-1] = true;
      }
    }
    int result = 0;
    for(int i = 0;i < hasSunuke.length;i++) {
      if(!hasSunuke[i]) {
        result++;
      }
    }
    System.out.println(result);
  }
}