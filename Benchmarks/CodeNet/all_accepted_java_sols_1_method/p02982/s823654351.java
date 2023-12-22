import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int d = stdIn.nextInt();
        int x[][] = new int[n][d];
        int count = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < d; j++){
                x[i][j] = stdIn.nextInt();
            }
        }
        
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                double sum = 0;
                for(int k = 0; k < d; k++){
                    sum += Math.pow(x[i][k] - x[j][k], 2);
                }  
                
                sum = Math.sqrt(sum);
                
                if(sum == (int)sum){
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
