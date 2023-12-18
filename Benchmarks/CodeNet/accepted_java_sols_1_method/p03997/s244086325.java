import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a, b, c;
    
    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();
    
    int ans = (a + b) * c / 2;
    System.out.println(ans);
  }

}