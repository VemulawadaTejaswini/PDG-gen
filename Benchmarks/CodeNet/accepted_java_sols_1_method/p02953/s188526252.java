import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int pre = 0;
        String r = "Yes";
        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(sc.next());
            if (pre > h) {
                h++;
                if (pre > h) r = "No";
            }
            pre = h;
        }
        System.out.println(r);
    }
}