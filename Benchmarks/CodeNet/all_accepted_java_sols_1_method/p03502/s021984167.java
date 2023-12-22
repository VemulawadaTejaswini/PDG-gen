import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        sc.close();

        int fx = 0;

        for (int i = 0; i < n.length(); i++) {
            fx += Integer.parseInt(String.valueOf(n.charAt(i)));
        }

        if (Integer.parseInt(n) % fx == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
