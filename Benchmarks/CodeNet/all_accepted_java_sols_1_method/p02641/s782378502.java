import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        boolean[] exist = new boolean[105];
        for (int i = 0; i < N; i++) {
            exist[sc.nextInt()] = true;
        }

        int minDiff = X+1;
        int minNum = -1;
        for (int i = 0; i < exist.length; i++) {
            if (exist[i]) continue;
            if (Math.abs(X-i) < minDiff) {
                minDiff = Math.abs(X-i);
                minNum = i;
            }
        }

        System.out.println(minNum);
    }
}
