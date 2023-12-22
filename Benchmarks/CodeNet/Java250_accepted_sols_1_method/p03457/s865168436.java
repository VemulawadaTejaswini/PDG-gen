import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] t = new int[N+1];
        int[] x = new int[N+1];
        int[] y = new int[N+1];
        for(int i=1; i<=N; i++){
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        String ans = "Yes";
        for(int i=1; i<=N; i++){
            int dis = Math.abs(x[i]-x[i-1]) + Math.abs(y[i]-y[i-1]);
            int dt = t[i]-t[i-1];
            if(dis>dt||((dis-dt)&1)==1){
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
}