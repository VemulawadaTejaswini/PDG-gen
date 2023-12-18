import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String line =  new Scanner(System.in).next();
        int r1 = 0, r2 = 0;
        boolean b = true;
        for (char c : line.toCharArray()) {
            if (b) {
                if (c == '0') {
                    ++r1;
                } else {
                    ++r2;
                }
            } else {
                if (c == '1') {
                    ++r1;
                } else {
                    ++r2;
                }
            }
            b = !b;
        }
        System.out.println(Math.min(r1, r2));
    }
}
