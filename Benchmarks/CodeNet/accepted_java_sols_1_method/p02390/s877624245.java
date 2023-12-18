import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int time = scanner.nextInt();
    int h = time / 60 / 60;
    int m = (time / 60) % 60;
    int s = time % 60;

    System.out.println(h+":"+m+":"+s);
  }
}