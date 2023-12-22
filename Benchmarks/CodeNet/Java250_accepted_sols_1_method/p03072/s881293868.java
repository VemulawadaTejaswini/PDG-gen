import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] heightArr = new int[n];
        for (int i = 0; i < n; i++) {
            heightArr[i] = sc.nextInt();
        }

        int hotelCount = 0;
        for (int i = 0; i < heightArr.length; i++) {
            if (i == 0) {
                // 一番西の場合は必ず海が見える
                hotelCount++;
                continue;
            }

            boolean canSeeSea = true;
            for (int j = 0; j < i; j++) {
                if (heightArr[j] > heightArr[i]) {
                    canSeeSea = false;
                    break;
                }
            }

            if (canSeeSea) {
                hotelCount++;
            }
        }

        System.out.println(hotelCount);
    }
}
