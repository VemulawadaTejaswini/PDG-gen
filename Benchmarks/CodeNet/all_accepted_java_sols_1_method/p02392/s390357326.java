import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        String res = "";
        if( a < b && b < c ) res = "Yes";
        else res = "No";

        PrintWriter pw = new PrintWriter(System.out);
        pw.println(res);
        pw.flush();
    }
}
