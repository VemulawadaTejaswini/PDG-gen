import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] Lz = new int[M];
        int[] Rz = new int[M];
        for (int m = 0; m < M; m++){
            Lz[m] = sc.nextInt();
            Rz[m] = sc.nextInt();
        }
        int left = 0;
        int right = N;
        for (int m = 0; m < M; m++){
            if (Lz[m] > left) left = Lz[m];
            if (Rz[m] < right) right = Rz[m];
            if (left > right) {
                System.out.println("0");
//                break;
                System.exit(0);
            }
        }
        System.out.println(right-left+1);
    }
}