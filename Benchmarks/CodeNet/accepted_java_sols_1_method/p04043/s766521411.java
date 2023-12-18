import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fiveCnt = 0;
        int sevenCnt = 0;
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(sc.next());
            if (a == 5) {
                fiveCnt++;
            } else if (a == 7) {
                sevenCnt++;
            }
        }
        if (fiveCnt == 2 && sevenCnt == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
