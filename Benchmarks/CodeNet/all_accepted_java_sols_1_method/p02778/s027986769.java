import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        for(int i = 0; i < s.length(); i++) {
            System.out.print("x");
        }
        System.out.println();

        scan.close();
        return;
    }
}