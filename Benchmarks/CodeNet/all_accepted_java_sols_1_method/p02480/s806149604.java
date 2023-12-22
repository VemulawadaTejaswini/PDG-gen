import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int num = scan.nextInt();
  int ans = 0;
  ans = num * num * num;
  System.out.printf("%d%n",ans);
 }
}