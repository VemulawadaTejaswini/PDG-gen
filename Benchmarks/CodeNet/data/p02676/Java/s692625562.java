import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String k = sc.nextLine();
    int ik = Integer.parseInt(k);
    String s = sc.nextLine();

    if(s.length() > ik){
        s = s.substring(0, ik);
        s = s+"...";
    }
    System.out.println(s);
  }
}