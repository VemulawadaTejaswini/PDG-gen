import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int check =0;
    for (int i=0; i<S.length(); i++) {
      for (int j=i+1; j<S.length(); j++) {
        if(S.charAt(i) == S.charAt(j)) {
          check++;
          break;
        }
      }
    }
    if (check == 0) {
      System.out.print("yes");
    } else {
      System.out.print("no");
    }
   }
}