import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String T = scan.next();
    String[] split = S.split("");
    String[] splits = T.split("");
    int N = S.length();
    for(int i = 0; i < N; i++)
    if (!(split[i].equals(splits[i]))) {
      System.out.println("No");
      return;
    }
    System.out.println("Yes");
  }
}