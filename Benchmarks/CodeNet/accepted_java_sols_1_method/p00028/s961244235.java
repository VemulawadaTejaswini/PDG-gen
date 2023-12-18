import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = new int[105];
        int max = 0;
        boolean f = false;

        while(input.hasNext()) {
            int t = input.nextInt();
            x[t] += 1;
        }
        for (int n : x) {
            if (max < n) {
                max = n;
            }
        }
        for (int i = 1; i < 105; i++) {
            if (x[i] == max) {
                System.out.println(i);
            }
        }
    }
}