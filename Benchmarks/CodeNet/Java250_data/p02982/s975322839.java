import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < d ; j++){
                x[i][j] = sc.nextInt();
            }
        }
        int ebishu = 0;
        sc.close();
        for(int i = 0 ;i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                double yono = 0;
                for(int k = 0 ; k < d ; k++){
                    yono += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
                }
                yono = Math.sqrt(yono);
                if(yono % 1 == 0){
                    ebishu++;
                }
            }
        }
        System.out.println(ebishu);
    }
}
//鶏になれ