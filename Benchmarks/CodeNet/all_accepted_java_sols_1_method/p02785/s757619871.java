import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] h = new Integer[n];
        long ans = 0;
        for(int i = 0;i<n;i++){
            h[i] = sc.nextInt();
        }
        if(k>=n){
            System.out.println(ans);
        } else {
            Arrays.sort(h,Collections.reverseOrder());
            for(int i = 0;i<k;i++){
                h[i] = 0;
            }
            for(int i = 0;i<n;i++){
                ans += h[i];
            }
            System.out.println(ans);
        }
    }
}