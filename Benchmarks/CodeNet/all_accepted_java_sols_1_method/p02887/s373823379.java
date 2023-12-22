import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] ca = sc.next().toCharArray();
    int count = 0;
    char ahead = '\0';
    for (int i = 0; i < n; i++) {
      if (ahead != ca[i]) {
        count++;
        ahead = ca[i];
      }
    }
    System.out.println(count);
  }
}