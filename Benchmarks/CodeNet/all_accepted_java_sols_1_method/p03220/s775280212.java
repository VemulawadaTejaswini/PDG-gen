import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t =sc.nextDouble(),a=sc.nextDouble();
        double[] h = new double[n];
        int ans = 0;
        for(int i = 0;i<n;i++){
            h[i] = sc.nextDouble();
            if(Math.abs(a-(t-h[i]*6/1000))<Math.abs(a-(t-h[ans]*6/1000))){
                ans = i;
            }
        }
        System.out.println(ans+1);
    }
}
