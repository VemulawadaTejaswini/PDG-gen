import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] S = sc.next().split("");
    String[] T = sc.next().split("");
    int count = 0;
    for (int i = 0; i < S.length; i++) {
      if (!S[i].equals(T[i])) count++;
    }
    System.out.println(count);
  }
}