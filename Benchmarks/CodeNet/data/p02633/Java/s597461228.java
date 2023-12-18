import java.util.Scanner;

class Main{
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int k = 360 / (180 - x);
    System.out.println(k);
  }
}