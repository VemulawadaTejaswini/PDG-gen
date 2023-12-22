import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int cnt = X*(X-1)/2+Y*(Y-1)/2;
    System.out.println(cnt);
  }
}
