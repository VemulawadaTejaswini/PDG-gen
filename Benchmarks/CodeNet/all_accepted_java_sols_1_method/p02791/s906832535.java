import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int i = 0; i < N; i++) {
            int P = sc.nextInt();
            if(P <= min) {
                res++;
                min = P;
            }
        }
        System.out.println(res);
    }
}
