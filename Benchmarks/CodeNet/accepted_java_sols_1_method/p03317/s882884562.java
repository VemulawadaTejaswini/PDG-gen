import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int temp = N;
        int count = 0;
        while(temp > 0) {
            if (count == 0) {
                temp -= K;
            }
            else {
                temp -= (K-1);
            }
                count ++;
        }

        System.out.println(count);
    }
}
