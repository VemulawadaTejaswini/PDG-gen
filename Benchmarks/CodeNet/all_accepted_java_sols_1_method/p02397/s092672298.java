import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    while(x != 0 || y != 0){
      if(x > y) {
        System.out.println(y + " " + x);
      }else {
        System.out.println(x + " " + y);
      }
      x = sc.nextInt();
      y = sc.nextInt();
    }
  }
}