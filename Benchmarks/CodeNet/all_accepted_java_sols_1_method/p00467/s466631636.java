import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        while(M != 0 || N != 0) {
            int[] inst = new int[N + 1];
            int[] nums = new int[M];

            for (int i = 0; i < N; i++)
                inst[i + 1] = sc.nextInt();
            for(int i = 0; i < M; i++)
                nums[i] = sc.nextInt();

            int nowPos = 1;
            int i = 0;
            for (i = 0; nowPos < N; i++) {
                nowPos += nums[i];
                if(nowPos <= N)
                    nowPos += inst[nowPos];
                //System.out.println(nowPos);
            }

            System.out.println(i);
            N = sc.nextInt();
            M = sc.nextInt();
        }

        sc.close();
    }
}

