import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int i = 1;
        while (input != 0) {
            System.out.println("Case " + i + ": " + input);
            input =sc.nextInt();
            i++;
        }

        sc.close();
    }
}
