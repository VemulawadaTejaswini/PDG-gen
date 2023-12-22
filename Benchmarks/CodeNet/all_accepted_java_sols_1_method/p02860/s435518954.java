import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        if (n % 2 == 1) {
            System.out.println("No");
            return;
        }

        String s1 = s.substring(0, n/2);
        System.out.println(s1.equals(s.substring(n/2, n)) ? "Yes": "No");
    }
}