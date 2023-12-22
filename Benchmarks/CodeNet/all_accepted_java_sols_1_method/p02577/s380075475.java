import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int num = 0;
        for (int i = 0; i < line.length(); i++) {
            num += (line.charAt(i) - 48);
        }

        if (num % 9 != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
