import java.util.Scanner;
class Main {
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  int W = scanner.nextInt();
  int H = scanner.nextInt();
  int x = scanner.nextInt();
  int y = scanner.nextInt();
  int r = scanner.nextInt();
  boolean i = W >= x + r && H >= y + r;
  boolean j = x >= 0 && y >= 0;
  if(i && j){
      System.out.println("Yes");
  } else {
      System.out.println("No");
  }
  }
}