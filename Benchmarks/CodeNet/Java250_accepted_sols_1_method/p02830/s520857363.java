import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int num = scan.nextInt();
   String a = scan.next();
   String[] a2 = a.split("");
   String b = scan.next();
   String[] b2 = b.split("");
   for (int i = 0; i < num; i++) {
     System.out.print(a2[i]);
     System.out.print(b2[i]);
   }
  }
}