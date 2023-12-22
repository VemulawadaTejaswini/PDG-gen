import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().toCharArray()[0];
        int code = (int) c;
        if (code >= 122) {
            code = 97;
        } else {
            code++;
        }
        System.out.println((char) code);
    }
}