import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int sum = 700;
        for (int i = 0; i < 3; i++) {
            if (line.charAt(i) == 'o') {
                sum += 100;
            }
        }

        System.out.print(sum);
    }
}
