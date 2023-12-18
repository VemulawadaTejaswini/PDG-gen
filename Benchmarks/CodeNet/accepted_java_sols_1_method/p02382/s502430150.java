
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] x = new Double[n]; Double[] y = new Double[n]; 
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++)
        {
            y[i]=sc.nextDouble();
        }
        for(Double p =1.;p<5;p++)
        {
           Double ans = 0.;
            for(int i=0; i<n;i++)
            {
                 if(p<4)
                 {
                      ans += Math.pow(Math.abs(x[i]-y[i]), p);
                 }
                 else
                 {   
                    Double temp = Math.abs(x[i]-y[i]); 
                    if(temp>ans)
                    {
                        ans= temp;
                    }
                 }
            }
            if(p<4)
            {
                 ans = Math.pow(ans,1/p);
            }
            System.out.printf("%.5f\n",ans);
        }
    }
}


