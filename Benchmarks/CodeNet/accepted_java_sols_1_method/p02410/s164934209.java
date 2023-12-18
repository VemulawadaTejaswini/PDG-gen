import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        
        int[][] lst = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                lst[j][i]=sc.nextInt();
            }
        }
        
        int[] x = new int[m];
        for(int i=0;i<m;i++){
            x[i] = sc.nextInt();
        }
        
        int sum;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<m;j++){
                sum+=lst[j][i]*x[j];
            }
            System.out.println(sum);
        }
    }
}
