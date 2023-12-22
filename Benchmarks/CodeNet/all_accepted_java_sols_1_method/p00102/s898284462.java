import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            int n = scan.nextInt();
            if(n == 0)break;
            int[][] array = new int[n + 1][n + 1];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    array[i][j] = scan.nextInt();
                }
            }
            int sum = 0;
            for(int i = 0; i < n; i++){
                int xsum = 0;
                int ysum = 0;
                for(int j = 0; j < n; j++){
                    xsum += array[j][i];
                    ysum += array[i][j];
                }
                array[n][i] = xsum;
                array[i][n] = ysum;
                sum += xsum;
            }
            array[n][n] = sum;

            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= n; j++){
                    System.out.printf("%5d",array[i][j]);
                }
                System.out.println("");
            }

        }
    }
}