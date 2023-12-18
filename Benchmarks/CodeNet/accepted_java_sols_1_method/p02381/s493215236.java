import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
        int n = sc.nextInt();

        if(n==0) break;

        int score[] = new int[n];
        for(int i=0; i<n; i++) score[i] = sc.nextInt();

        double mean = 0;
        double bunnsann = 0;
        double ans;

        //mean
        for (int i = 0; i < n; i++) mean += (double) score[i];
        mean /= n;

        //bunnsann
        for (int i = 0; i < n; i++) bunnsann += Math.pow((double) (score[i] - mean), 2.0);
        bunnsann /= n;

        //ans
        ans = Math.sqrt(bunnsann);

        System.out.printf("%.8f\n",ans);
        }
        sc.close();
    }
}
