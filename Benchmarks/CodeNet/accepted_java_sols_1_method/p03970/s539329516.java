import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String c = "CODEFESTIVAL2016";
        int res = 0;
        for (int i=0; i<16;i++) {
            if (s.charAt(i) != c.charAt(i)) {
                res++;
            }
        }
        System.out.println(res);
    }
}