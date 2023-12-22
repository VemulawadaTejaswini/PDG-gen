import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char[] c = S.toCharArray();
    
    for(int i=0; i<S.length(); i++){
      c[i]= (char)((c[i]-'A'+N)%26+'A');
    }
    String str = "";
    System.out.println(str.valueOf(c));
  }
}