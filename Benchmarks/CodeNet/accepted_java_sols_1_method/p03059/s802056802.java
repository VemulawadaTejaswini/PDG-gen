import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int T = sc.nextInt();

    int biscuit = T / A * B;

    System.out.println(biscuit);

  }
}
