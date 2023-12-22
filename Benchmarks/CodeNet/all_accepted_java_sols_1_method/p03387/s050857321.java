import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[3];
        for (int i = 0; i < 3; i++) {
            values[i] = sc.nextInt();
        }
        Arrays.sort(values);

        if ((3 * values[2] % 2) == ((values[0] + values[1] + values[2]) % 2)) {
            int ans = ((3 * values[2]) - (values[0] + values[1] + values[2])) / 2;
            System.out.println(ans);
        } else {
            int ans = ((3 * (values[2] + 1)) - (values[0] + values[1] + values[2])) / 2;
            System.out.println(ans);
        }
    }
}