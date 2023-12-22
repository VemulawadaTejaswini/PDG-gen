import java.util.Scanner;

class Main {
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String a = sc.next();
      String b = sc.next();
      String res = "";

      for (int i = 0; i < n; i++) {
        res += (""+ a.charAt(i) + b.charAt(i));
      }

      System.out.println(res);
	}
}