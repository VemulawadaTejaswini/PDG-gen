import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int rem1 = X/500; // 1024/500=2
    int rem2 = (X-(rem1*500))/5; // 24/5=4
    System.out.println(1000*rem1+5*rem2);
  }
}