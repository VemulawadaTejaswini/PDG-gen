import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] N = sc.next().toCharArray();
    boolean ans = (N[0] == N[1] && N[1] == N[2])
      || (N[1] == N[2] && N[2] == N[3]);
    System.out.println(ans ? "Yes" : " No");
  }
}