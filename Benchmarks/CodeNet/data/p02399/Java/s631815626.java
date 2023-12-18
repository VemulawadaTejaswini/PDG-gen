import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();

    int d = a / b;
    int r = a % b;
    if(r == 0){int f = a / b; System.out.println(d + " " + r + " " + f);}
    else {
    float f = (float) a / b; System.out.println(d + " " + r + " " + f);
    }
  }
}