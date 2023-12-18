import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String N=sc.next();
    char[] n=N.toCharArray();
    if(n[0]==n[2]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}