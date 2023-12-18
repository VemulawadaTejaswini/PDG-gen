import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[][] matrix,tes;
    static boolean[][] mb;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }

    static boolean read(){
        n = sc.nextInt();
        if(n == 0)return false;

        int[][] matrix = new int[n][n];
        boolean[][] mb = new boolean[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
                System.out.print(matrix[i][j] + " ");
                mb[i][j] = false;
            }
            System.out.println();
        }
        //solve();
        return true;
    }

    static void solve(){
        int res = -1;
        boolean f = false;
        int[] row = new int[n];
        int[] column = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                row[j] = matrix[i][j];
                column[j] = matrix[j][i];
            }
            Arrays.sort(row);
            Arrays.sort(column);
            int shortest = row[0];
            int longest = column[n-1];
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == shortest)mb[i][j] = true;
            }
            for(int j = 0; j < n; j++){
                if(matrix[j][i] == longest && mb[i][j] == true){
                    res = matrix[i][j];
                    f = true;
                }
            }
        }

        if(f){
            System.out.println(res);
        }else{
            System.out.println(0);
        }
    }

}