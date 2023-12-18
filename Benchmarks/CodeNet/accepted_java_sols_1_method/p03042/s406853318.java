import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    String s = stdIn.next();

    String s1 = s.substring(0,2);
    String s2 = s.substring(2,4);
    int a = Integer.parseInt(s1);
    int b = Integer.parseInt(s2);

    if(a >= 1 && a <= 12) {
      if(b >= 1 && b <= 12) {
        System.out.println("AMBIGUOUS");
      }else {
        System.out.println("MMYY");
      }
    }else {
      if(b >= 1 && b <= 12) {
        System.out.println("YYMM");
      }else {
        System.out.println("NA");
      }
    }
  }
}