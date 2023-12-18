import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (Character.isLowerCase(ch)) {
        sb.append(Character.toUpperCase(ch));
      } else {
        sb.append(Character.toLowerCase(ch));
      }
    }
    System.out.println(sb.toString());
  }
}

