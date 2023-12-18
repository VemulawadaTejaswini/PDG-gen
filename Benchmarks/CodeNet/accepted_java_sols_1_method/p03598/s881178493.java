import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] x = new int[n];
        for(int i = 0;i<n;i++){
            x[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
            if(x[i]<=Math.abs(k-x[i])){
                ans += 2*x[i];
            } else {
                ans += 2*Math.abs(k-x[i]);
            }
        }
        System.out.println(ans);
    }
}