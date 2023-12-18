import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        int max = 0;
        int sum =0;
        for (int i =0; i<N; i++) {
            int temp = sc.nextInt();
            sum += temp;
            if (max<temp) {
                max = temp;
            }
        }

        System.out.println(sum - (max/2));
    }

}