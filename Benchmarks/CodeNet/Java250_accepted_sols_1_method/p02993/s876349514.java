import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String security_code = scanner.nextLine();

        int before = 0;
        before = security_code.codePointAt(0);
        for(int p = 1; p < 4; p++) {
          if (before == security_code.codePointAt(p)) {
            System.out.println("Bad");
            return;
            }
          before = security_code.codePointAt(p);
          }
        System.out.println("Good");
    }
}