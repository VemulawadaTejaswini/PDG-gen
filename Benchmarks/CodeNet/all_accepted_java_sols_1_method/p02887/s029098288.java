
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char prev ='$';
    int result=0;
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      if(c != prev) result++;
      prev =c;
    }

    System.out.println(result);
  }





}
