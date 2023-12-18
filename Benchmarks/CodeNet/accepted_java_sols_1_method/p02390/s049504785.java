import java.util.*;

public class Main {
    public static void main(String[] args) {
        int seconds, s, m, h;
        Scanner sc = new Scanner(System.in);
        seconds = sc.nextInt();
        h = seconds / 3600;
        m = (seconds % 3600) / 60;
        s = seconds % 60;
        System.out.println( h + ":" + m + ":" + s);
    }
}
