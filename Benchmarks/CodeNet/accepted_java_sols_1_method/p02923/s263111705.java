import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int result = 0;
    int count = 0;
    int num = 0;
    for (int i = 0; i < N; i++)
      if (num >= (num = sc.nextInt()))
        count++;
      else {
        if (result < count)
          result = count;
        count = 0;
      }
    if (result < count)
      result = count;
    System.out.println(result);
  }
}