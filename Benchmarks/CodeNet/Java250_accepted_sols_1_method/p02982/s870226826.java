import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int[][] points = new int[N][D];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < D; j++){
                points[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < N; i++){
            int[] point = points[i];
            for(int j = i + 1; j < N; j++){
                int[] otherP = points[j];
                int temp = 0;
                for(int k = 0; k < D; k++){
                    temp = temp + (point[k] - otherP[k]) * (point[k] - otherP[k]);
                }
                if(Math.sqrt(temp) - Math.floor(Math.sqrt(temp)) == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
