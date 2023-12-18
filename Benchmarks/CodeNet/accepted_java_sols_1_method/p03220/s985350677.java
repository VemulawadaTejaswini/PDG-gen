import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        double[] h = new double[n+1];
        for(int i=1;i<=n;i++) h[i] = sc.nextDouble();
        int ans = -1;
        double dt = Double.MAX_VALUE/2;
        for(int i=1;i<=n;i++){
            double cur = t-0.006*h[i];
            double now = Math.abs(cur-a);
            if(now<dt){
                dt = now;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
