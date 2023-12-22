import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    StringBuilder S = new StringBuilder(sc.next());

    char lower = Character.toLowerCase(S.charAt(K - 1));
    S.setCharAt(K - 1, lower);
    System.out.println(S.toString());
  }
}
