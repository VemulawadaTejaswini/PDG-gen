import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();

    int ans = 0;

    switch (str_scan) {
      case "RSS":
        ans=1;
        break;
      case "SRS":
        ans=1;
        break;
      case "RSR":
        ans=1;
        break;
      case "SSR":
        ans=1;
        break;
      case "SRR":
        ans=2;
        break;
      case "RRS":
        ans=2;
        break;
      case "RRR":
        ans=3;
        break;
      default:
        ans=0;
    }

    System.out.println(ans);
    scan.close();
  }
}