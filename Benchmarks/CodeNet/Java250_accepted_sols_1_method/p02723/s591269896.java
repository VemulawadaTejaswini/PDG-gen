import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	String str=sc.next();
    char c[]=new char[200]; 
    char[] s=str.toCharArray();
    if(s[2]==s[3]&&s[4]==s[5]){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}