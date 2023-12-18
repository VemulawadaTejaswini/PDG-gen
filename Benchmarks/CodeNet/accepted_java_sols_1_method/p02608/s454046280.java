import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n + 1];
        int[][][] dp = new int[101][101][101];
        for(int i = 1; i < 101; i++){
            for(int j = 1; j < 101; j++){
                for(int k = 1; k < 101; k++){
                    int curr = i * i + j * j + k * k + i * j + j * k + i * k;
                    dp[i][j][k] = curr;
                    if(curr <= n)
                        arr[curr]++;
                }
            }
        }
        for(int i = 1; i <= n; i++)
            System.out.println(arr[i]);
    }
}