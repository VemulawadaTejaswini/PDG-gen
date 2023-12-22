import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int A = Integer.parseInt(S.substring(0,1)), B = Integer.parseInt(S.substring(1,2)),
    C = Integer.parseInt(S.substring(2,3)), D = Integer.parseInt(S.substring(3,4));
    int p1 = A+B+C+D, p2=A+B+C-D, p3=A+B-C+D, p4=A+B-C-D,
    p5=A-B+C+D, p6=A-B+C-D, p7=A-B-C+D, p8=A-B-C-D;
    
    if(p1==7) {
      System.out.println(A + "+" + B + "+" + C + "+" +D + "=7");
    } else if(p2==7) {
      System.out.println(A + "+" + B + "+" + C + "-" +D + "=7");
    } else if(p3==7) {
      System.out.println(A + "+" + B + "-" + C + "+" +D + "=7");
    } else if(p4==7) {
      System.out.println(A + "+" + B + "-" + C + "-" +D + "=7");
    } else if(p5==7) {
      System.out.println(A + "-" + B + "+" + C + "+" +D + "=7");
    } else if(p6==7) {
      System.out.println(A + "-" + B + "+" + C + "-" +D + "=7");
    } else if(p7==7) {
      System.out.println(A + "-" + B + "-" + C + "+" +D + "=7");
    } else {
      System.out.println(A + "-" + B + "-" + C + "-" +D + "=7");
    }
  }
}