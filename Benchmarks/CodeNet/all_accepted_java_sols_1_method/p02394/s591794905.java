import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int w,h,r,x,y;
    w = scan.nextInt();
    h = scan.nextInt();
    x = scan.nextInt();
    y = scan.nextInt();
    r = scan.nextInt();
    if (x+r <= w && x-r >= 0 && y+r <= h && y-r >= 0){
      System.out.println("Yes");
    }  else {
      System.out.println("No");
    }
    scan.close();
  }
}
