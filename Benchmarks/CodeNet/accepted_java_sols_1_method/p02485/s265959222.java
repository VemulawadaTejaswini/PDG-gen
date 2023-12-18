import java.util.Scanner;

class Main {
  public static void main(String str[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      String input = sc.next();
      int s = 0;

      if(input.equals("0")) {
        break;
      }

      for(int i = 0; i < input.length(); i++) {
        s += Character.getNumericValue(input.charAt(i));
      }

      System.out.println(s);
    }
  }
}