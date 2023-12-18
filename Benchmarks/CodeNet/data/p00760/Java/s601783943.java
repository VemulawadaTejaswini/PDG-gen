import java.util.*;
public class Main{
    void run(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int[][] dic = {{20, 20},{19, 20},{19, 20}};
        int[][][] date = new int[1000][11][21];
        for(int y = 1; y < 1000; y++){
            for(int m = 1; m <= 10 ; m++){
                for(int d = 1; d <= dic[y%3][m%2]; d++){
                    date[y][m][d] = count;
                    count++;
                }
            }
        }
        while(0 < n--){
            int Y = sc.nextInt();
            int M = sc.nextInt();
            int D = sc.nextInt();
            System.out.println(count - date[Y][M][D]);
        }
    }
    public static void main(String[] args){
        new Main().run();
    }
}