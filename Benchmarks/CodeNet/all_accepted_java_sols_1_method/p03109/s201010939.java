import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.matches("2019/0[1-4]/[0-3][0-9]")) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
        sc.close();
    }
}