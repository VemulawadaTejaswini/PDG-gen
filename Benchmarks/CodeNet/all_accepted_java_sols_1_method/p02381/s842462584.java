import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;
        double[] ans = new double[1000];
        int k=0;
        while(true){
            n = scan.nextInt();
            if(n==0)break;
            int[] a = new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                a[i]=scan.nextInt();
                sum+=a[i];
            }
            double ave = (double)sum/n;
            double var=0;
            for(int i=0;i<n;i++){
                var =var+((a[i]-ave)*(a[i]-ave)/n);
            }
            ans[k] = Math.sqrt(var);
            k++;
        }
        for(int i=0;i<k;i++){
            System.out.printf("%.5f\n",ans[i]);
        }
    }
}
