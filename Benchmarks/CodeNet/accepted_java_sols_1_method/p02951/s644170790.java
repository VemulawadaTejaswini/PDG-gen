import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] token = line.split(" ");
        int max1 = Integer.parseInt(token[0]);
        int cur1 = Integer.parseInt(token[1]);
        int cur2 = Integer.parseInt(token[2]);

        int residual;
        if (max1 - cur1 < cur2) {
            residual = cur2 - (max1 - cur1);
        } else {
            residual = 0;
        }

        System.out.println(residual);
    }
}