import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String O = sc.next();
        String E = sc.next();
        String result = "";
        for (int i = 0; i < O.length() + E.length(); i++) {
            if (i % 2 == 0) {
                result = result + String.valueOf(O.charAt(i / 2));
            } else {
                result = result + String.valueOf(E.charAt(i / 2));
            }
        }
        System.out.println(result);
    }

}
