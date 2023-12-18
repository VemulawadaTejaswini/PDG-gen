import java.util.Scanner;

public class Main{
  public static void main{
    Scanner scan = new Scanner(System.in);
    Int W = scan.nextInt();
    Int H = scan.nextInt();
    Int x = scan.nextInt();
    Int y = scan.nextInt();
    Int r = scan.nextInt();

    if(x+r>W|| x-r<0|| y+r>H|| y-r<0){
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}