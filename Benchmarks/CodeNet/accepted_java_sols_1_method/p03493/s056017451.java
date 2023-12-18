import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str[] = s.split("");
        int count = 0;

        for (int i = 0; i < 3; i++) {
            if (str[i].equals("1")) {
                count++;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(count);

        sc.close();
        out.flush();
    }
}