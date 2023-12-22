import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String message = "";
        for (int i = 0; i < 25 - a; i++) {
            message += " Eve";
        }
        System.out.println("Christmas" + message);
    }
}
