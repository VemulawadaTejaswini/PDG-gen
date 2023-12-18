import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        final int M = scan.nextInt();
        int[][] codes = new int[NUM][M];
        int[] rate = new int[M];
        int bonus = scan.nextInt();
        for(int i = 0; i < M; i++){
            rate[i] = scan.nextInt();
        }
        for(int i = 0; i < NUM; i++){
            for(int j = 0; j < M; j++){
                codes[i][j] = scan.nextInt();
            }
        }

        // search
        int count = 0 ;
        for(int i = 0; i < NUM; i++){
            int sum = 0;
            for(int j = 0; j < M; j++){
                sum += codes[i][j] * rate[j];
            }
            sum+= bonus;
            if(sum > 0){
                count++;
            }
        }

        // answer
        System.out.println(count);

    }
}