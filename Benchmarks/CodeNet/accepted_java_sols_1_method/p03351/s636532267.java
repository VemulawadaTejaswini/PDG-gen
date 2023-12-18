import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int ac=Math.abs(a-c);
    // System.out.println(ac);
    int bc=Math.abs(c-b);
    int ab=Math.abs(a-b);
    // System.out.println(bc+" "+ab);

    if (ac<=d||(bc<=d&&ab<=d)) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
