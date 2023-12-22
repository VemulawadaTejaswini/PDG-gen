import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] array = new int[a][b];
        int count = 0;
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                array[i][j] = sc.nextInt();
            }
        }
        double ans = 0;
        for(int i = 0; i < a - 1; i++){
            for(int j = i + 1; j < a; j++){
                for(int k = 0; k < b; k++){
                    ans = ans + Math.pow(array[i][k] - array[j][k], 2);
                }
                ans = Math.sqrt(ans);
                if(ans == (int)ans){
                    count++;
                }
                ans = 0;
            }
        }
        System.out.println(count);
    }
}