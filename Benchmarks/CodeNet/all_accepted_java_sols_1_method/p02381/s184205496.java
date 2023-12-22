import java.lang.Math;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double m=0;
        double[] si = new double[1001];
        int i,n;
        double z=0;
        while(true){
            n = s.nextInt();
            if(n==0)break;
            for(i=0;i<n;i++){
                si[i]=s.nextInt();
                m+=si[i];
            }
            m/=(double)n;
            for(i=0;i<n;i++)z+=(si[i]-m)*(si[i]-m);
            z/=(double)n;
            System.out.println(Math.sqrt(z));
            m=0;
            z=0;

        }
        
    }
}
