import java.util.Scanner;

class Main
{
  public static void main(String[] args) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println((a/b)+" "+(a%b)+" "+String.format("%1$4f",((double)a/b)));
  }
}