public class Main {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String s = scanner.next();
    StringBuilder builder = new StringBuilder(s.length() / 2);
    for (int i  = 0; i < s.length(); i++) {
          if (i % 2 == 0) { builder.append(s.charAt(i)); }
    }
    System.out.println( builder.toString());
 }
}