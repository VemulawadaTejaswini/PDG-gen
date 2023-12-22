import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        final int DIMENSION = scan.nextInt();
        int[][] points = new int [NUM][DIMENSION];
        for(int i = 0; i < NUM; i++){
            for(int j = 0; j < DIMENSION; j++){
                points[i][j] = scan.nextInt();
            }
        }

        // search
        int count = 0;
        for(int i = 0; i < NUM - 1; i++){
            for(int j = i + 1; j < NUM; j++){
                double sum = 0.0;
                for(int k = 0; k < DIMENSION; k++){
                    sum += Math.pow(points[i][k] - points[j][k] , 2);
                }
                sum = Math.sqrt(sum);
                if(sum == (int)sum){
                    count++;
                }
            }
        }

        // answer
        System.out.println(count);

    }
}