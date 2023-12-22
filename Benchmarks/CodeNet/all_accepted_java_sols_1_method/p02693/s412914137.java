import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        int k = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i < b + 1; i++){
            if (i % k == 0) {
                printWriter.println("OK");
                printWriter.flush();
                return;
            }
        }
        printWriter.println("NG");
        printWriter.flush();
    }
}
