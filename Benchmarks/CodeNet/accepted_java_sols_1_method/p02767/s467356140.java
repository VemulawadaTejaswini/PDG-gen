import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        int[] Xi = null;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Xi = new int[N];
            for (int i = 0; i < N; i++) {
                Xi[i] = sc.nextInt();
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < 101; i++) {
            int temp = 0;
            for(int j : Xi){
                temp += Math.pow(Math.abs(i - j),2);
            }
            if(result > temp){
                result = temp;
            }
        }

        System.out.println(result);
    }
}
