import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    byte k = sc.nextByte();
    sc.nextLine();
    String s = sc.nextLine();
    sc.close();
    if(s.length() > k) {
      s = s.substring(0, k) + "...";
    }
    System.out.println(s);
  }
}