import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    int z = scan.nextInt();
    int temp;
 
    if(x > y){
      temp = x;
      x = y;
      y = temp;
    }
    if(y > z){
      temp = y;
      y = z;
      z = temp;
    }
    if(x > y){
      temp = x;
      x = y;
      y = temp;
    }
    System.out.println("x y z");
  }
}