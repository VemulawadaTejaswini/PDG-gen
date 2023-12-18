import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String S = sc.next();

    char[] l = new char[S.length()];
    l = S.toCharArray();

    l[K-1] = Character.toLowerCase(l[K-1]);

    String str = String.valueOf(l);

    System.out.println(str);

  }

}