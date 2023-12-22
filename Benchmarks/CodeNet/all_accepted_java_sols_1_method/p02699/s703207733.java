import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    if (b >= a)
      System.out.println("unsafe");
    else
		System.out.println("safe");
  }
}