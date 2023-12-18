import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[][] l = new int[2][m];
                for(int i = 0 ; i < m ; i++){
                        for(int j = 0 ; j < 2 ; j++){
                                l[j][i] = sc.nextInt();
                        }
                }
                for(int i = 0 ; i < 2 ; i++){
                        Arrays.sort(l[i]);
                }
                sc.close();
                System.out.println(Math.max(0 , l[1][0] - l[0][m - 1] + 1));
        }
}