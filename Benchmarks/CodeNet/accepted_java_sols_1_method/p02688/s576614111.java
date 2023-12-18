import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int k = Integer.parseInt(s.next());
        boolean sun[] = new boolean[n];

        for(int i = 0; i < n;i++) {
            sun[i] = false;
        }

        for(int i = 0; i < k;i++) {
            int d = Integer.parseInt(s.next());
            for(int j = 0; j < d;j++) {
                int h = Integer.parseInt(s.next());
                sun[h-1] = true;
            }
        }

        int res = 0;
        for(int i = 0; i < n;i++) {
            if (!sun[i]) {
                res++;
            }
        }
        System.out.println(res);
    }
}