import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int[] sortX = new int[N];
        for(int i = 0; i < N; i++){
            X[i] = sc.nextInt();
            sortX[i] = X[i];
        }
        Arrays.sort(sortX);
        int a = sortX[N/2 -1];
        int b = sortX[N/2];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            if(X[i] <= a) sb.append(b + "\n");
            else sb.append(a + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
