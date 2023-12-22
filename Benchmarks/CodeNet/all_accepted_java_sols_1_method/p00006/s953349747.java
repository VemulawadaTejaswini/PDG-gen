import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer(sc.nextLine());

    System.out.println(sb.reverse());
  }
}