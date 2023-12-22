import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int length = String.valueOf(n).length();

        if(length % 2 == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = length-1; i > 0; i--) {
                if(i % 2 == 0) {
                    sb.append("0");
                } else {
                    sb.append("9");
                }
            }
            out.print(sb);
        } else if(length == 1) {
            out.print(n);
        } else {
            int count = 0;
            int base = 1;
            for (int i = 0; i <length-1 ; i++) {
                base = base * 10;
            }
            count = count + (n - base) + 1;

            StringBuilder sb = new StringBuilder();
            for (int i = length - 2; i > 0; i--) {
                if(i % 2 == 0) {
                    sb.append("0");
                } else {
                    sb.append("9");
                }
            }
            count = count + Integer.parseInt(sb.toString());
            out.print(count);

        }

        out.flush();

    }

}
