import java.util.Scanner;

class Main
{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int second = scan.nextInt();
    System.out.println(second/3600 +":"+ (second/60%60) +":"+ second%60);
  }
}