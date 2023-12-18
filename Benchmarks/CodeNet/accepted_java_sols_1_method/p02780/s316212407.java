import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        for(int i=0;i<n;i++)p[i]=sc.nextInt();
        double[] mean = new double[n];
        mean[0]=(p[0]+1)/2.0;
        for(int i=1;i<n;i++)mean[i]=(p[i]+1)/2.0+mean[i-1];
        double ans = 0;

        for(int i=0;i<n-k+1;i++){
            double temp;
            if(i==0)temp = mean[i+k-1];
            else temp = mean[i+k-1]-mean[i-1];
            ans=Math.max(ans,temp);
        }

        System.out.println(ans);

    }

}


