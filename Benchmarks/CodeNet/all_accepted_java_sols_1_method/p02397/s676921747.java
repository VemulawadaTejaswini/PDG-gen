import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    for(int i=0; i<3000; i++) {
      int x = scan.nextInt(); int y = scan.nextInt();
      if(x==0 && y==0) {
        break;
      }
      int z;
      if(x > y) {
        z = x; x = y; y = z;
      }
      System.out.println(x + " " + y);
    }
  }
}