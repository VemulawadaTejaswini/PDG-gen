import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();

    int ans = 0;
    int c = 1;
    while (c < B) {
        c--;
        c += A;
        ans++;
    }

    System.out.println(ans);
  }
}