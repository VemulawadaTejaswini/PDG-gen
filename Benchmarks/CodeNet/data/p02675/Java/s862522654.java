import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            String n = s.next();
            System.out.println(unit(n));
        }
    }
    private static String unit(String n) {
        switch (n.charAt(n.length() - 1)) {
            case '3':
                return "bon";
            case '0':
            case '1':
            case '6':
            case '8':
                return "pon";
            default:
                return "hon";
        }
    }
}