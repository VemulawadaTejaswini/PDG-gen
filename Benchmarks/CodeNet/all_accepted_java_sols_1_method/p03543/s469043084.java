public class Main {
public static void main(String[] args) {
 java.util.Scanner scanner = new java.util.Scanner(System.in);
 String n = scanner.next();
 if (n.charAt(0) == n.charAt(1)  && n.charAt(0) == n.charAt(2)) {
   System.out.println("Yes");
 } else if (n.charAt(3) == n.charAt(1)  && n.charAt(3) == n.charAt(2)) {
   System.out.println("Yes");
 } else {
   System.out.println("No");
 }
}
}