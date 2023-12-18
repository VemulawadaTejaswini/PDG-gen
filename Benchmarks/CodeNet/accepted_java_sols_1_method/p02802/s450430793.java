import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] ac = new boolean[n];
        int[] wa = new int[n];
        int acSum = 0;
        int waSum = 0;
        for (int i = 0; i < m; i++) {
            int index = sc.nextInt() - 1;
            boolean isAc = sc.next().equals("AC");
            if (ac[index]) {
                continue;
            }
            if (isAc) {
                acSum++;
                ac[index] = true;
                waSum += wa[index];
            } else {
                wa[index]++;
            }
        }
        System.out.println(acSum + " " + waSum);
    }
}