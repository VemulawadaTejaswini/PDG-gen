import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] s;
        int count=0,sum=0,num;
        double m;
        double a,a2=0;
        Scanner sc=new Scanner(System.in);
        
        num=sc.nextInt();
        
        s=new int[1001];
        
        while(true)
        {
            s[count]=sc.nextInt();
            sum+=s[count];
            count++;
            
            if(count==num)
            {
                m=(double)sum/num;
        
                for(int i=0;i<num;i++)
                {
                    a2+=(s[i]-m)*(s[i]-m);
                }
                
                a=Math.sqrt(a2/(double)count);
        
                System.out.printf("%f\n",a);
                
                sum=0;
                count=0;
                a2=0;
                num=sc.nextInt();
                if(num==0)
                {
                    break;
                }
                s=new int[1001];
            }
        }
    }
}