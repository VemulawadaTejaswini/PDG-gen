import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      String x = sc.nextLine();
      if (x.equals("0")) {
        break;
      } else {
        int answer = 0;
        for (int i=0;i<x.length();i++)
          answer += Integer.parseInt(String.valueOf(x.charAt(i)));
        System.out.println(answer);
      }

    }
    sc.close();
  }
}
