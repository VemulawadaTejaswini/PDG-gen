import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] ss = s.split(" ");
    int a = Integer.parseInt(ss[0]);
    int b = Integer.parseInt(ss[1]);
    System.out.println(a * b + " " + (a + b) * 2);
  }
}
