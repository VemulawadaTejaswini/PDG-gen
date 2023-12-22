import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[][] targetMap;
        int prevValue = 0;
        int max = Integer.MIN_VALUE;
        int ans = 0;

        targetMap = new int[4][N+2];

        String[] line = sc.nextLine().split(" ");

        for(int i = 0; i < N;i++){
            targetMap[1][i+1] = Integer.parseInt(line[i]);
        }

        line = sc.nextLine().split(" ");

        for(int i = 0; i < N;i++){
            targetMap[2][i+1] = Integer.parseInt(line[i]);
        }
        
        int indexX = 1;
        while(indexX <= N){

            for(int x = 1;x <= indexX;x++){
                ans += targetMap[1][x];
            }

            for(int nextX = indexX;nextX <= N;nextX++){
                ans += targetMap[2][nextX];
            }

            if (ans > max){
                max = ans;
            }

            ans = 0;
            indexX++;
        }

        System.out.println(max);
    }

 }
