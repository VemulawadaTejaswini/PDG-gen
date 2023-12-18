import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = Integer.parseInt(sc.next());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println((sec/3600) + ":" + (sec/60%60) + ":" + (sec%60));
        pw.flush();
    }
}
