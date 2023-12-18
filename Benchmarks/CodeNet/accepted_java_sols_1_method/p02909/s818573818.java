import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next(), T[] = {"Sunny", "Cloudy", "Rainy"};
    for (int i = 0; i < 3; i++)
      if (S.equals(T[i])) System.out.println(T[(i + 1) % 3]);
  }
}