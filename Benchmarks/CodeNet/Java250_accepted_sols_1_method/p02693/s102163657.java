import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k =  sc.nextInt();
    int a =  sc.nextInt();
    int b =  sc.nextInt();

    int x = b/k*k;
    System.out.println(x>=a?"OK":"NG");
  }
}