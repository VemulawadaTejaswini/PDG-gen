import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int current = 1;
        int sum = 0;
        while (true) {
            if (sum + current >= x) {
                System.out.println(current);
                break;
            }
            sum += current++;
        }
    }
}
