import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();

    System.out.println(Math.min(B, A * N));

  }
}
