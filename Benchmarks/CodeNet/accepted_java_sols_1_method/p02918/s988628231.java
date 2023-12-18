import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    char[] cs = sc.next().toCharArray();
    int count = 0;
    for (int i = 0; i < N - 1; i++)
      if (cs[i] == cs[i + 1])
        count++;
    System.out.println((int) Math.min(count + K * 2, N - 1));
  }
}