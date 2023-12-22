import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] k = new int[n];
        int[][]a = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = 0;
            }
        }
        int like = 0;
        for(int i=0; i<n; i++){
            k[i] = sc.nextInt();
            for(int j=0; j<k[i]; j++){
                like = sc.nextInt();
                a[i][like-1] = 1;
            }
        }
        int counter = 0;
        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                if(a[i][j] == 0){
                    break;
                }
                else if(i == n-1){
                    counter += 1;
                }
            }
        }
        System.out.println(counter);
    }
}