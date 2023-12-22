import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),t=sc.nextInt(),a=sc.nextInt();
        int[] h = new int[n];
        for(int i = 0;i<n;i++){
            h[i] = sc.nextInt();
        }
        int ans = 0;
        int min = 999999999;
        for(int i = 0;i<n;i++){
            int tmp = 1000*t-6*h[i];
            if(Math.abs(tmp-1000*a)<min){
                min = Math.abs(tmp-1000*a);
                ans = i+1;
            }
        }
        System.out.println(ans);
    }
}