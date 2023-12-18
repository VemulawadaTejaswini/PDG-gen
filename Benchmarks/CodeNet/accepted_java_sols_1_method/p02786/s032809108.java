import java.util.Scanner;

public class Main {
    public static void main(String[] ags) {
        Scanner s = new Scanner(System.in);
        long h = s.nextLong();
        double l = Math.log(h) / Math.log(2);
        int p = (int)Math.ceil(l) + (Math.floor(l) < l ? 0 : 1);
        System.out.println((long)Math.pow(2, p) - 1);
    }
}
