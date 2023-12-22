import java.util.*;
public class Main {
  public static void main(String[] args) {
  	Scanner s = new Scanner(System.in);
    StringBuilder st = new StringBuilder(s.next());
    int sum = 0;
    for(int i=0;i<st.length();i++) {
      sum += st.charAt(i) - 48;
    }
    if(sum%9 == 0)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
