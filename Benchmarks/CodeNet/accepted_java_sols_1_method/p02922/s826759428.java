import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int num = 1;
    int ans = 0;
    for (int i = 0; i < 100; i++) {
      if(num>=B) break;
      num = num -1 +A;
      ans++;
    }

    System.out.println(ans);

  }

}
