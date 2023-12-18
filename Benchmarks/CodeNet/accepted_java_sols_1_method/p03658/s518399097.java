import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int [] l = new int [N];
        for (int i = 0 ; i < N ; i++ ) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int max = 0;
        for(int i = 0 ; i < K ; i ++) {
            max += l[N - 1 - i];
        }
        System.out.println(max);
    }

}