
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] a = new int[n][m];
        int[] sums = new int[m+1];
        
        for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        int sum = 0;        
        int total = 0;
        
        for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                
                System.out.print(a[i][j] +" ");
                sum += a[i][j];
                
                if(j == m-1){
                    System.out.println(sum);
                    sum = 0;
                }
                
                sums[j] += a[i][j];
             
            }
        }
        
        for(int i=0; i<sums.length -1; i++){
            System.out.print(sums[i] + " ");
            total += sums[i];
        }
        
        System.out.println(total);
        
    }
}



