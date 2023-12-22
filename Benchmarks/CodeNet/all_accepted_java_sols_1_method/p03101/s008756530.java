import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int H = sc.nextInt();
    int W = sc.nextInt();

    int h = sc.nextInt();
    int w = sc.nextInt();

    int X = H - h;
    int Y = W - w;
    int Z = X * Y;

    System.out.println(Z);

  }
}