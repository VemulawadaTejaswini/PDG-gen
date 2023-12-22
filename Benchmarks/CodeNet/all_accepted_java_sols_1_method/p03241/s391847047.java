import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int N,M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        for (int p = M/N; p >= 1; p--){
            if (M % p != 0) {
                continue;
            }

            System.out.println(p);
            return;

        }


    }
}
