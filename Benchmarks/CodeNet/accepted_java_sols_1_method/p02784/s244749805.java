import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        int H = Integer.parseInt(values[0]);
        int N = Integer.parseInt(values[1]);
        line = scanner.nextLine();
        values = line.split(" ");

        int atkDam = 0;
        for (int i = 0; i < N; i++) {
            atkDam += Integer.parseInt(values[i]);
        }
        System.out.println(H <= atkDam ? "Yes" : "No");
    }
}