import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        
        
        while(scan.hasNext())
        {
            int n = scan.nextInt();
            int m = scan.nextInt();
            
            //終了条件
            if(n+m==0)
                break;
            
            int[] nFlg = new int[n];
            
            int total = n;
            int tmp=0,i=0;
            
            for(i=0;i<n;i++)
                nFlg[i]=0;
            
            while(total!=1)
            {
                for(i=0;i<m;i++)
                {
                    if(tmp+i>=n)
                    {
                        tmp=i*(-1);
                    }
                    
                    if(nFlg[tmp+i]==1)
                    {
                        i--;
                        tmp++;
                    }

                }
                nFlg[tmp+i-1]=1;
                tmp+=i;
                total--;
            }
            
            for(i=0;i<n;i++)
            {
                if(nFlg[i]==0)
                {
                   i++;
                   System.out.println(i);
                }
            }
        }
    }
}