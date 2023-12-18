import java.util.*;
 
public class Main{
    public static int[] solve(int[][] treasure, int W){
        int[] save = new int[W+1];
        for(int i = 0; i < treasure.length; i++){
            for(int j = W; j >= 0; j--){
                if( save[j] != 0 && j + treasure[i][1] <= W ){
                    save[j+treasure[i][1]] = Math.max(treasure[i][0] + save[j], save[j+treasure[i][1]]);
                }
            }
            save[treasure[i][1]] = Math.max(treasure[i][0], save[treasure[i][1]]);
        }
        int max = 0;
        for(int i = 0; i <= W; i++){
             if( save[max] < save[i] ){
                max = i;
             }
        }
     
        int[] ans = new int[2];
        ans[0] = save[max];
        ans[1] = max;
        return ans;
    }
         
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int index = 0;
        int W;
        while( (W = stdIn.nextInt()) != 0 ){
            int n = stdIn.nextInt();
            int[][] treasure = new int[n][2];
            for(int i = 0; i < n; i++){
                String[] s = stdIn.next().split(",");
                treasure[i][0] = Integer.parseInt(s[0]);
                treasure[i][1] = Integer.parseInt(s[1]);
            }
            int[] ans = solve(treasure, W);
            System.out.println("Case " + (++index) + ":");
            System.out.println(ans[0]);
            System.out.println(ans[1]);
        }
    }
}