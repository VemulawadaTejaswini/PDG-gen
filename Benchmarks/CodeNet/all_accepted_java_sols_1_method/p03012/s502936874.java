import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] wei = new int[num];
        int[] ans = new int[num-1];
        int sum = 0;
        int t = 0;

        for(int i = 0;i < num;i++){
            wei[i] = sc.nextInt();
            sum += wei[i];
        }
        
        for(int i = 0;i < num-1;i++){
            int s1 = 0;
            for(int j = 0;j <= t;j++){
                s1 += wei[j];
            }
            ans[i] = Math.abs(sum-(2*s1));
            t++;
        }
        Arrays.sort(ans);
        System.out.println(ans[0]);
    }
}