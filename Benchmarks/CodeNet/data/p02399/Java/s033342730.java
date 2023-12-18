import java.util.Scanner;
public class Main{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int d = a/b;
    int r = (double)a%(double)b;
    double f = a/b;
    System.out.println(d+" "+r+" "+String.format("%.5f",f));
  }
}