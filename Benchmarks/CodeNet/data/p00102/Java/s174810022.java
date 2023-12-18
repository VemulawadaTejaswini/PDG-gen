import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }else{
                int array[][] = new int[n + 1][n + 1];
                for(int i = 0; i < n; i++){
                    for(int j = 0; j < n; j++){
                        array[i][j] = sc.nextInt();
                        array[i][n] += array[i][j];
                        array[n][j] += array[i][j];
                    }
                    array[n][n] += array[i][n];
                }
                for(int i = 0; i < n + 1; i++){
                    for(int j = 0; j < n + 1; j++){
                        System.out.printf("%5d", array[i][j]);
                    }
                    System.out.println();
                }
            }
            
        }
    }
}

