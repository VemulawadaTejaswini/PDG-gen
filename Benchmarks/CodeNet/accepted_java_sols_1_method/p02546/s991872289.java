import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    String ans;

    boolean result = str_scan.endsWith("s");

    if (result){
      ans = str_scan + "es";
    }else{
      ans = str_scan + "s";
    }

    System.out.println(ans);
    scan.close();
  }
}