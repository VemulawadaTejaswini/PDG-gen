import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner kbd=new Scanner(System.in);
    int n=kbd.nextInt();

    double odd=n/2+n%2;

    System.out.printf("%.8f",odd/n);
  }
}
