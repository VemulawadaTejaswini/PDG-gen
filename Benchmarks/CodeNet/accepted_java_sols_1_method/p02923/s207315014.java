// AtCoder Beginner Contest 139 C - Lower
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++){
            heights[i] = scan.nextInt();
        }

        int downCountMax = 0;
        int downCount = 0;
        for(int i = 0; i <= n - 2; i++){
            if(heights[i] >= heights[i + 1]){
                downCount += 1;
                downCountMax = Math.max(downCount, downCountMax);
            }else{
                downCount = 0;
            }
        }

        System.out.println(downCountMax);
    }
}
