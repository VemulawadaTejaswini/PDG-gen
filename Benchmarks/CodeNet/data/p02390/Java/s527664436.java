import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int h = S / 3600;
        int m = S % 3600;
        m = m / 60;
        int s = m % 60;
        s = s / 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}