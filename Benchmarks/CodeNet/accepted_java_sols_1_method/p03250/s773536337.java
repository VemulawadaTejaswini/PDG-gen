import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    String c=sc.next();
    int a1=Integer.parseInt(a);
    int b1=Integer.parseInt(b);
    int c1=Integer.parseInt(c);
    int max=0;

    int ab=Integer.parseInt(a+b);
    max=Math.max(max,ab+c1);
    int ba=Integer.parseInt(b+a);
    max=Math.max(max,ba+c1);
    int ac=Integer.parseInt(a+c);
    max=Math.max(max,ac+b1);
    int ca=Integer.parseInt(c+a);
    max=Math.max(max,ca+b1);
    int bc=Integer.parseInt(b+c);
    max=Math.max(max,bc+a1);
    int cb=Integer.parseInt(c+b);
    max=Math.max(max,cb+a1);


    System.out.println(max);



  }
}
