import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String b=sc.next();
    if(b.charAt(0)=='A') System.out.println("T");
    if(b.charAt(0)=='T') System.out.println("A");
    if(b.charAt(0)=='C') System.out.println("G");
    if(b.charAt(0)=='G') System.out.println("C");

  }
}
