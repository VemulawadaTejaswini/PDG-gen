import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] foodCount = new int[M];
        for(int i = 1; i <= N; i++){
            int k = sc.nextInt();
            for(int j = 0; j < k; j++){
                foodCount[sc.nextInt() - 1]++;
            }
        }
        
        int howManyFoodAllGuysLike = 0;
        for(int i = 0; i < M; i++){
            if(foodCount[i] == N) howManyFoodAllGuysLike++;
        }
        System.out.println(howManyFoodAllGuysLike);
    }
}
