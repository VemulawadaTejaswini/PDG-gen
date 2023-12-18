import java.util.Scanner;

class Main{
  public static void main(String args[]){
    System.out.println("文字を入力して下さい。");

    Scanner scan = new Scanner(System.in);

    int a = scan.next();
    int b = scan.next();

    System.out.println(a*b+" "+2*a+2*b);
  }
}