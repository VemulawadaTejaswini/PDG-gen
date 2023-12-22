import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String S = sc.next();
    String ans = "";

    String[] str = S.split("");
    str[K - 1] = str[K - 1].toLowerCase();

    for(int i = 0; i < str.length; i++) {
    	ans += str[i];
    }

    System.out.println(ans);
  }
}