import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char S[] = sc.next().toCharArray();
    Arrays.sort(S);
    System.out.println((S[0] == S[1] && S[1] != S[2] && S[2] == S[3]) ? "Yes" : "No");
  }
}