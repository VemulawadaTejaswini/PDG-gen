import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s_p = sc.nextInt();
        int s_w = sc.nextInt();
        int h_p = sc.nextInt();
        int h_w = sc.nextInt();
        int timelimit = sc.nextInt();
        int time = 0;
        String print = "NO";
        do {
            time++;
            s_p += s_w;
            h_p += h_w;
            if (s_p == h_p) {
                print = "YES";
                break;
            }
        } while (time < timelimit);
        System.out.println(print);
    }
}