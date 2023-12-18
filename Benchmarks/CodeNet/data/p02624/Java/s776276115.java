import java.io.*;

public class Main {
    private static int MAX = 10000001;
    private static int divisor[] = new int[MAX];
    static void precompute()
    {
        for (int pos = 2; pos*pos < MAX; pos++) {
            for (int i = pos*pos; i < MAX; i+=pos) {
                    divisor[i]++;
                    if(i/pos != pos)
                        divisor[i]++;
                }
            }

    }
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(buffer.readLine());
        long sum = 1;
        precompute();
        for (int num = 2; num < n + 1; num++) {
            sum += (long)num*(divisor[num]+2);
//            System.out.println(num+" "+(divisor[num]+2));
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
