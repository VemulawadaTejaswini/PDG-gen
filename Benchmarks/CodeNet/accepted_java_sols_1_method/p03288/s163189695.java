import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        String ret;

        if (R < 1200) {
            ret = "ABC";
        } else if (R < 2800) {
            ret = "ARC";
        } else {
            ret = "AGC";
        }

        System.out.println(ret);
    }
}