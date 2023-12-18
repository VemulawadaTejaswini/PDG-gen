
import java.util.*;

class Main
{
    public static void main(String [] args)
    {
       Scanner sc = new Scanner(System.in);
       int n;
       while((n = sc.nextInt())!=0)
        {
            Double sum=0.0, m=0., SD=0., temp=0.;
            Double s[] = new Double[n];
            for (int i = 0; i<n; i++)
            {
               s[i] = sc.nextDouble();
               sum += s[i]; 
            } 
            m = sum/n;
            for(int i = 0; i<n;i++)
            {
                temp += Math.pow((s[i]-m), 2);
            }
            SD = Math.sqrt(temp/n);
            System.out.printf("%.4f\n",SD);
        }
    }
}
