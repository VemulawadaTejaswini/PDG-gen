import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int map[][] = new int[2][N];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < N; j++){
                map[i][j] = sc.nextInt();
            }
        }
        
        int max = 0;
        for(int i = 0; i < N; i++){
            int down = 0, sum = 0;
            for(int j = 0; j < N-1; j++){
                if(i == j)
                    down = 1;
                sum += map[down][j+1-down];
            }
            max = sum > max ? sum : max;
        }
        max += map[0][0] + map[1][N-1];
        
        System.out.println(max);
    }
    
}