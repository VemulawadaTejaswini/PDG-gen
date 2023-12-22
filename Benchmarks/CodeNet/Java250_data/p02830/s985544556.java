import java.io.InputStream;
import java.util.Scanner;

// https://atcoder.jp/contests/abc148/tasks/abc148_b
public class Main {
  public static void main(String[] args){
    System.out.println(new Main().excute(System.in)); 
  }
  public String excute(InputStream f) {
    Scanner scan = new Scanner(f);
    int N = scan.nextInt();
    scan.nextLine();
    String[] S = scan.nextLine().split(" ");
    
    StringBuffer r = new StringBuffer();
    for (int i = 0;  i < N; i++) {
      r.append(S[0].charAt(i));
      r.append(S[1].charAt(i));
    }
    return  r.toString();
  }
}
