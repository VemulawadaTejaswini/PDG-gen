import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        //int a = Integer.parseInt(sc.next());
        //int b = Integer.parseInt(sc.next());
        //int c = Integer.parseInt(sc.next());
        String in = sc.nextLine();
        if(in.contains("A") && in.contains("B")) {
            out.println("Yes");
        } else {
            out.println("No");
        }
        //System.out.println(a + " " + b + " " + c);

    }
}