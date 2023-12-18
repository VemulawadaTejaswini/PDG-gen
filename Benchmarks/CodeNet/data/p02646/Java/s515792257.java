import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s_p = sc.nextLong();
        long s_w = sc.nextLong();
        long h_p = sc.nextLong();
        long h_w = sc.nextLong();
        long timelimit = sc.nextLong();
        long time = 0;
        String print = "NO";
        do {
            time++;
            s_p += s_w;
            h_p += h_w;
            if (s_p >= h_p) {
                print = "YES";
                break;
            }
        } while (time < timelimit);
        System.out.println(print);
    }
}