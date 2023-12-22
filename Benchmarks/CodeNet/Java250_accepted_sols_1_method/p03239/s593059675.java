import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int timeLimit = sc.nextInt();
        Integer cMin = null;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int t = sc.nextInt();
            if (t <= timeLimit) {
                if (cMin == null || c < cMin) {
                    cMin = c;
                }
            }
        }
        System.out.println(cMin == null ? "TLE" : cMin);
    }
}
