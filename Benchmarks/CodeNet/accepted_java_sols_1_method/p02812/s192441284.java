import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] s = scanner.nextLine().split("");
        int count = 0;
        for (int x = 0; x < n - 2; x++) {
            if (s[x].equals("A") && s[x + 1].equals("B") && s[x + 2].equals("C")) {
                count++;
            }
        }
        System.out.println(count);
    }

}
