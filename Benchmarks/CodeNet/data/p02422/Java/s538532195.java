import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    int q = sc.nextInt();

    for (int i = 0; i < q; i++) {
        String op = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt() + 1;

        switch (op) {
            case "print":
            System.out.println(str.substring(a, b));
            break;
            case "reverse":
            StringBuffer sb = new StringBuffer(str.substring(a, b));
            str = str.substring(0, a) + sb.reverse().toString() + str.substring(b);
            break;
            case "replace":
            String p = sc.next();
            str = str.substring(0, a) + p + str.substring(b);
            break;
        }
    }
  }
}
