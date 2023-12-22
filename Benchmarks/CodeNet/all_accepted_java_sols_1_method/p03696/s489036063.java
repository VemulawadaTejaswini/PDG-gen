import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int needLeft = 0;
      int openCnt = 0;
      for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == '(')
          openCnt++;
        else {
          if(openCnt == 0)
            needLeft++;
          else 
            openCnt--;
        }
      }

      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < needLeft; i++)
        sb.append('(');
      sb.append(s);
      for(int i = 0; i < openCnt; i++)
        sb.append(')');
      System.out.println(sb.toString());
  }
}
