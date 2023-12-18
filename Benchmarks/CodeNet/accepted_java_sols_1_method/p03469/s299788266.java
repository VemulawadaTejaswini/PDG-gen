import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String S=sc.next();
    char[] s=S.toCharArray();
    s[3]='8';
    System.out.println(String.valueOf(s));
  }
}