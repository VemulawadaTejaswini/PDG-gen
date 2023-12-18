import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.next());
        String b = scan.next();
        int c = Integer.parseInt(scan.next());
        String answer = "No ";
        String rep = "[^"+(b.charAt(c-1))+"]";
        answer = b.replaceAll(rep,"*");

       PrintWriter out = new PrintWriter(System.out);
        out.println(answer);
        out.flush();
        scan.close();
    }
}