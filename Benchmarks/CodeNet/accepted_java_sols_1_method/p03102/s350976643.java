import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int[] multiply = new int[M];
        for (int i = 0 ; i < M; i++)
            multiply[i] = sc.nextInt();
        int ans = 0;
        for (int i = 0 ; i < N; i++){
            long sum = 0;
            for (int j = 0 ; j < M ; j++){
                sum += (multiply[j] * sc.nextInt());
            }
            sum += C;
            if(sum > 0)
                ans ++;
        }
        System.out.println(ans);
        sc.close();
    }
}
