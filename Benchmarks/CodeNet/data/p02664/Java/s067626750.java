import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String t=sc.next();
    String ta[]=new String[t.length()+1];

    for (int i=0;i<t.length();i++) {
      ta[i]=t.substring(i,i+1);
    }

    ta[t.length()]="P";

    for (int i=1;i<t.length();i++) {
      if (ta[i-1].equals("P")&&ta[i].equals("?")) {
        ta[i]="D";
      }
      if (ta[i-1].equals("D")&&ta[i+1].equals("D")||ta[i+1].equals("?")&&ta[i].equals("?")) {
        ta[i]="P";
      }
      if (ta[i-1].equals("D")&&ta[i+1].equals("P")&&ta[i].equals("?")) {
        ta[i]="D";
      }
    }

    for (int i=0;i<t.length();i++) {
      System.out.print(ta[i]);
    }

    System.out.println();
  }
}
