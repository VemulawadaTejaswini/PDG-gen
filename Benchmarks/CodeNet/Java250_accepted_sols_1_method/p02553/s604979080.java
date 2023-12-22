import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextInt();
    long b = sc.nextInt();
    long c = sc.nextInt();
    long d = sc.nextInt();

    long[] s = new long[4];
    s[0] = a*c;
    s[1] = a*d;
    s[2] = b*c;
    s[3] = b*d;

    long ans = s[0];
    for(int i = 0; i < 4; i++) {
      if(ans < s[i]) ans = s[i];
    }

    System.out.println(ans);
  }
}
