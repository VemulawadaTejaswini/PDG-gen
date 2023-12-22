import java.util.*;
public class Main{
  private static String strs;
  static char []a;
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    strs=sc.next();
    char[]a = strs.toCharArray();
    for (int i=a.length-1;i>=0;i--){
    	System.out.print(a[i]);
    }
    System.out.println();
  }
}