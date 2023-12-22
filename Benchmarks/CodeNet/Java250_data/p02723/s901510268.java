import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	String str=sc.next();
    char[] c=str.toCharArray();
    if(c[2]==c[3]&&c[4]==c[5]){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}