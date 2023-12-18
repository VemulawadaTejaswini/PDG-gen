import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力受取
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line1 = input.readLine();

        int N = Integer.parseInt(line1);
        int[] A = new int[N];
        int max1 = 0;
        int max2 = 0;
        for(int i=0;i<N;i++) {
            A[i] = Integer.parseInt(input.readLine());
            // 1番目に大きい値と2番目に大きい値を計算しておく
            if(max1<=A[i]) {
                max2 = max1;
                max1 = A[i];
            } else if(max2<=A[i]) {
                max2 = A[i];
            }
        }

        for(int i=0;i<N;i++) {
            // 1番目に大きい数と同じなら2番めに大きい数を出力する
            if(A[i]==max1) {
                System.out.println(max2);
            } else {
                System.out.println(max1);
            }
        }

    }
}
