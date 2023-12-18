import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        int H = Integer.parseInt(values[0]);
        int A = Integer.parseInt(values[1]);
        if (H % A == 0) {
            System.out.println(H / A);
        } else {
            System.out.println( ((H / A) + 1) );
        }
    }
}