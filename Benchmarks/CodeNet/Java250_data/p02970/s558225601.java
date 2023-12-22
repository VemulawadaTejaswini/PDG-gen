import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力受取
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line1 = input.readLine();

        String[] arr = line1.split(" ");
        int N = Integer.parseInt(arr[0]);
        int D = Integer.parseInt(arr[1]);

        // 1人が見れる本数
        int a = D * 2 + 1;
        // N本を見るために必要な監視員
        int b = N / a;
        if(N % a > 0) b++;

        System.out.println(b);
    }
}
