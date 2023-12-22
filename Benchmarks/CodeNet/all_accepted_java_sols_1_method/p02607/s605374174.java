import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] a = new int [N];
        for (int i = 0;i < N ; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        for (int i = 1;i <= N; i++) {
            if (i % 2 == 1 && a[i-1] % 2 == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}