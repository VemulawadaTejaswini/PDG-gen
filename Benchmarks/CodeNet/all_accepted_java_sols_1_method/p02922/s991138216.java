import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = 1;
    int count = 0;
    while (c < b) {
      count += 1;
      c += (a - 1);
    }
    System.out.println(count);
    sc.close();
  }
}
