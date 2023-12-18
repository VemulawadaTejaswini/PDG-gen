import java.util.Scanner;

public class Main {
    
    public static int num1;
    public static int num2;
    public static int[][] array;
    public static int flag;

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        while(true){

            num1 = scn.nextInt();
            num2 = scn.nextInt();

            if(num1 == 0 && num2 == 0) break;

            array = new int[num2][num1];


            for(int i = 0; i < num2; i++){
                for(int j = 0; j < num1; j++){
                    array[i][j] = scn.nextInt();
                }
            }
            int ans = 0;
            for(int i = 0; i < num2; i++){
                for(int j = 0; j < num1; j++){
                    flag = 1;
                    ans += solve(i,j);
                }
            }
            System.out.println(ans);

        }
    }
    public static int solve(int m, int n){

        if( m >= num2 || n >= num1 || m < 0 || n < 0) return 0;

        if( array[m][n] == 1 ){
            array[m][n] = 0;
            if(flag == 1){
                flag = 0;
                int tmp = solve(m + 1, n) + solve(m, n+ 1)  + solve(m + 1, n + 1) + solve(m + 1, n - 1)  + solve(m -1, n - 1)
                        +  solve(m - 1, n + 1) + solve(m - 1, n) + solve(m, n - 1);
                return 1;
            }
            else {
                return solve(m + 1, n) + solve(m, n + 1) + solve(m + 1, n + 1) + solve(m + 1, n - 1) + solve(m -1, n - 1)
                        +  solve(m - 1, n + 1) + solve(m - 1, n) + solve(m, n - 1);
            }
        }
        else return 0;
    }


}
