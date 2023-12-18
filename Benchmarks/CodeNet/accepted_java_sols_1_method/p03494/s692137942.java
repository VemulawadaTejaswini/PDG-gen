import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] aArr = new int[count];

        for (int i = 0; i < count; i++) {
            aArr[i] = sc.nextInt();
        }

        int roopCnt = 0;
        boolean hasOddNumber = false;
        while (true) {
            for (int i = 0; i < count; i++) {
                // 奇数がある
                if (aArr[i] % 2 != 0) hasOddNumber = true;
            }

            // 奇数がある時は抜ける
            if (hasOddNumber) break;

            for (int i = 0; i < count; i++) {
                aArr[i] /= 2;
            }

            roopCnt++;
        }

        System.out.println(roopCnt);
    }
}
