
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int[][] dist = new int[n][d];
        for(int i=0;i<n;i++){
            for(int j=0;j<d;j++){
                dist[i][j] = Integer.parseInt(sc.next());
            }
        }
        sc.close();

        double sum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                sum = 0;
                for(int k=0;k<d;k++){
                    sum+=(dist[i][k]-dist[j][k])*(dist[i][k]-dist[j][k]);
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