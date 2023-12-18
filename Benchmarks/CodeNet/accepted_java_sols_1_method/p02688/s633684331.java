import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int[] A = new int[n];
        int k = sc.nextInt();
        for(int i = 0; i < k; i++) {
            int d = sc.nextInt();
            for(int j = 0; j < d; j++) {
                A[sc.nextInt() - 1]++;
            }
        }
        for(int a : A) {
            if(a == 0) res++;
        }
        System.out.println(res);
    }
}
