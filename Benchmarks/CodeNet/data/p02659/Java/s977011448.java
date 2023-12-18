import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        String B = sc.next();

        StringBuilder builder = new StringBuilder();
        int pos = B.length()-1;
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == '.') {
                pos = i;
            } else {
                builder.append(B.charAt(i));
            }
        }
        int BB = Integer.parseInt(builder.toString());
        int d = B.length()-1-pos;

        int dd = 1;
        for (int i = 0; i < d; i++) {
            dd *= 10;
        } 

        System.out.println(A*BB/dd);
    }
}
