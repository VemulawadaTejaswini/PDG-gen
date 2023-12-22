import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char[] a=sc.next().toCharArray();
    char[] b=sc.next().toCharArray();
    char[] c=sc.next().toCharArray();
    a[0]=String.valueOf(a[0]).toUpperCase().charAt(0);
    b[0]=String.valueOf(b[0]).toUpperCase().charAt(0);
    c[0]=String.valueOf(c[0]).toUpperCase().charAt(0);
    char[] d={a[0],b[0],c[0]};
    String s=String.valueOf(d);
    System.out.println(s);
  }
}