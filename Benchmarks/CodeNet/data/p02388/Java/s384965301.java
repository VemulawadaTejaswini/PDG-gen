import java.util.Scanner;

public class Ex02{
  public static void main(String[] args){
  int x;
  int ans;
  
  Scanner stdin = new Scanner(System.in);
  x = stdin.nextInt();
  ans = x*x*x;
  System.out.println(+ans);
  }
}