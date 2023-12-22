import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in);
    int x = cin.nextInt();

    int res = sol(x);
    System.out.println(res);
  }

  private static int sol(int x) {
    return (x * x * x);
  }
}