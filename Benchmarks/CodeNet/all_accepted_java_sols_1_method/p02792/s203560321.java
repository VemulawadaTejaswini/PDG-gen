import java.util.*;
 
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        sc.close();

        int[][] c = new int[10][10];
        
        for(int i = 1; i <= N; i++){
            int head, tail, tmpi = i;
            head = tail = tmpi % 10;
            while(tmpi > 0){
                head = tmpi % 10;
                tmpi /= 10;
            }
            c[head][tail]++;
        }

        long ans = 0L;
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                ans += c[i][j] * c[j][i];
            }
        }

        System.out.println(ans);
    }
}