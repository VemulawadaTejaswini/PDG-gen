import java.util.*;

public class Main {
    public static int calculateNum(int k) {
        int a = 7, index = 1;
        for (int i = 0; i <= k; i++) {
            if (a % k == 0) return index;
            else {
                a = (a * 10 + 7) % k;
                index++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = 0;

        while(sc.hasNext()){
            K = sc.nextInt();
        }
        sc.close();
        System.out.println(calculateNum(K));
    }
}