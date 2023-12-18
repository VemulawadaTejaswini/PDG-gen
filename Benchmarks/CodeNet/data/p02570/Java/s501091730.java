import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int d = sc.nextInt();
    int t = sc.nextInt();
    int s = sc.nextInt();

    String result = "Yes";

    if(t*s<d) result = "No";

    System.out.print(result);
  }
}
