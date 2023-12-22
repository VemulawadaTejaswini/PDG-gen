import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        int[] balls = new int[NUM];
        int sum = 0;
        for(int i = 0; i < NUM; i++){
            balls[i] = scan.nextInt();
            sum += balls[i];
        }

        // search
        int halfSum = 0;
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < NUM-1; i++){
            halfSum += balls[i];
            if(Math.abs((sum - halfSum) - halfSum) < answer){
                answer = Math.abs((sum - halfSum) - halfSum);
            }
        }

        // answer
        System.out.println(answer);

    }
}