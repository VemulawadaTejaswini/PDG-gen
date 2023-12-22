import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            sum = sum + (a.charAt(i) - '0');
        }
        if (sum % 9 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}