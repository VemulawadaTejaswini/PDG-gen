import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int IMPOSSIBLE = -1;
        boolean isPossible = false;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int unbreakNum = 1;
        int unbreakCount = 0;

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == unbreakNum) {
                isPossible = true;
                unbreakCount++;
                unbreakNum++;
            }
        }

        if (!isPossible) {
            System.out.println(IMPOSSIBLE);
        } else {
            System.out.println(n - unbreakCount);
        }
    }
}