import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] input = line.split(" ", 0);

        int N = Integer.valueOf(input[0]).intValue();
        int K = Integer.valueOf(input[1]).intValue();
        int[] bunbo = new int[N];
        double result = 0.0;

        for(int i = 1; i < N+1; i++){
            int j = i;
            bunbo[i-1] = N;
            while(K > j) {
                j *= 2;
                bunbo[i-1] *= 2;
            }
            result += 1.0/bunbo[i-1];
        }

        System.out.println(result);

    }
}