import java.util.Scanner;

public class Main{
  public static void main(String args[]){

    Scanner scan = new Scanner(System.in);

    String str = scan.next();
    int a = Integer.parseInt(str);

    str = scan.next();
    int b = Integer.parseInt(str);
    if(a<b) System.out.println("a < b");
    else if(a>b) System.out.println("a > b");
    else if(a==b) System.out.println("a == b");
  }
}
