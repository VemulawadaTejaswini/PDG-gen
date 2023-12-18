import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int[] p = new int[N];
        int[] ans = new int[202];
        int min = 1000;
        int result = X;
        int j=0;
        for(int i=-100;i<=101;i++){
            ans[j] = Math.abs(X-i);
            j++;
        }
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            ans[num+100] = 1000;
        }
        for(int i=0;i<ans.length;i++){
            if(min>ans[i])
            {
                min = ans[i];
            }
        }
        result -= min;
        if(ans[result+100]==1000){
            result = X + min;
        }
        if(N==0){
            result = X;
        }
        System.out.println(result);
    }
}