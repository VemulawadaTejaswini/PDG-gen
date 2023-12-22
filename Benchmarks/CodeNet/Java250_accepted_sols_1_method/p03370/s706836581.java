import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] mArr = new int[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            mArr[i] = sc.nextInt();
            x -= mArr[i];
            count++;
        }

        Arrays.sort(mArr);
        int min = mArr[0];
        count += x/min;

        System.out.println(count);
    }
}
