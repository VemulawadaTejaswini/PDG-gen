import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int k=scanner.nextInt();
    String S=scanner.next();

    String[] strArray = new String[S.length()];

    for (int i = 0; i < S.length(); i++) {
      String str = String.valueOf(S.charAt(i));
      strArray[i] = str;
    }

    String lower_str2 = strArray[k-1].toLowerCase();
    strArray[k-1]=lower_str2;

    for (int i = 0; i < S.length(); i++) {
      System.out.print(strArray[i]);
    }

    System.out.println("");
  }
}
