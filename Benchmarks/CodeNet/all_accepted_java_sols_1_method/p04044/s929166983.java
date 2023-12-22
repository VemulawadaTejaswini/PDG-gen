import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] arsgs){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    String[] s = new String[n];
    for (int i = 0; i < n; i++){
      s[i] = sc.next();
    }
    Arrays.sort(s);
    for (int j = 0; j < n; j++){
      System.out.print(s[j]);
    }
  }
}