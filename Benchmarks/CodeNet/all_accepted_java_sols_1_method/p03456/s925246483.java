import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String a = in.next();
        String b = in.next();
        a += b;
        int c = Integer.parseInt(a);
        if ((double)Math.sqrt(c) == (int) Math.sqrt(c) ){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}