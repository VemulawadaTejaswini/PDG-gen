import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int h = Integer.parseInt(scanner.next());
        int a = Integer.parseInt(scanner.next());
        int i = 0;
        while (h > 0) {
            h = h - a;
            i++;
        }
        pw.println(i);
        pw.flush();
    }
}