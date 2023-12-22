import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        N = sc.nextInt();
        M = sc.nextInt();

        //箱を作る
        int[] box = new int[N+M];
        //箱の中にNとMを入れる
        for (int i =0; i < N; i++) {
            box[i] = 2;
        }
        for (int i = N; i < box.length; i++) {
            box[i] = 1;
        }

        int count = 0;
        for (int i = 0; i < box.length; i++) {
            for (int j = i+1; j < box.length; j++) {
                if ((box[i]+box[j]) % 2 == 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}