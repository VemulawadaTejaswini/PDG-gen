import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long Hz[] = new long[N];
        long sortedHz[] = new long[N];
        for (int i = 0; i < N; i++){
            Hz[i] = sc.nextInt();
        }
        Arrays.sort(Hz);
        for (int i = 0; i < N; i++) {
            sortedHz[N - i - 1] = Hz[i];
//            System.out.println(sortedHz[N - i - 1]);
        }

        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (i <= K - 1){
                continue;
            }

            sum += sortedHz[i];
        }
        System.out.println(sum);
    }
}

