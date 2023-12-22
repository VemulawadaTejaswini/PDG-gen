
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = in.next().trim();
        String t = in.next().trim();
        int sCount = in.nextInt();
        int tCount = in.nextInt();
        String u = in.next();
        if (s.equals(u)) {
            sCount -= 1;
        } else {
            tCount -= 1;
        }
        System.out.println(sCount + " " + tCount);
    }
}
