import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "No";
    char[] c = new char[s.length()];

    for(int i=0; i<s.length(); ++i)
      c[i] = s.charAt(i);

    Arrays.sort(c);

    if(c[0] == c[1] && c[2] == c[3] && c[1] != c[2])
      ans = "Yes";

    System.out.println(ans);
  }
}