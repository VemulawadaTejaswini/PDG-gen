public class Main {
  public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt(); 
        if (a==b) {
          System.out.println(c);
        } else if (b==c) {
           System.out.println(a);
        }else {
           System.out.println(b);
       }
 }

}
