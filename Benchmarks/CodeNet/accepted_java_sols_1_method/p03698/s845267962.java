import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] ac = S.toCharArray();
    Set<Character> C = new HashSet<>();

    for(char c: ac) {
    	C.add(c);
    }
    String ans = "no";
    if (C.size() == ac.length) ans = "yes";
    System.out.println(ans);

  }
}