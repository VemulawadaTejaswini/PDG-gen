import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String target = sc.next();
        String input = sc.next();

        while (!input.equals("END_OF_TEXT")) {
            if (input.equalsIgnoreCase(target)) cnt++;
            input = sc.next();
        }

        System.out.println(cnt);

        sc.close();
    }
}
