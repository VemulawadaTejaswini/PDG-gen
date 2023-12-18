import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();

        if(N%2==1) {
            System.out.println(((N - 1) + (N - 2) * (N - 1)) / 2);
            for (int i = N; i > 0; i--) {
                for (int j = i-1; j > 0; j--) {
                    if (i + j != N) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }else{
            System.out.println((N - 2)*N / 2);
            for (int i = N; i > 0; i--) {
                for (int j = i-1; j > 0; j--) {
                    if (i + j-1 != N) {
                        System.out.println(i + " " + j);
                    }
                }
            }

        }

    }
}