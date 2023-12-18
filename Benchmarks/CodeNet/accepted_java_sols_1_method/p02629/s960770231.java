import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = n;
        String res = "";
        while (x != 0) {
            int r = (int)(x % 26);
            if (r == 0) {
                r = 26;
            }
            char c = (char)(96 + r);
            res += String.valueOf(c);
            x = (x - r) / 26;
        }
        StringBuffer bufres = new StringBuffer(res);
        String res1 = bufres.reverse().toString();
        System.out.println(res1);
        sc.close();
    }
}