import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int fnd = 0;
    if (s.charAt(0) == 'A') {
      if (Character.isLowerCase(s.charAt(1))) {
        for (int i=2;i<s.length()-1;i++) {
          if (s.charAt(i)=='C') { fnd++;
          } else if (Character.isUpperCase(s.charAt(i))) {
            System.out.println("WA"); return;
          }
        }
        if (fnd==1) {
          if (Character.isLowerCase(s.charAt(s.length()-1))) {
            System.out.println("AC");
          } else {System.out.println("WA");}
        } else {System.out.println("WA");}
      } else {System.out.println("WA");}
    } else {System.out.println("WA");}
  }
}
