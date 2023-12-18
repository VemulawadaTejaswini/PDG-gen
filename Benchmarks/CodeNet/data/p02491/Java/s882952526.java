import java.util.Scanner;

class Main{
  public static void main(String[] args){
    int x , y;
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    y = sc.nextInt();
    System.out.print(x/y);
    System.out.print(" ");
    System.out.print(x%y);
    System.out.print(" ");
    float f = (float) x / y;
    System.out.println(f);
  }
}