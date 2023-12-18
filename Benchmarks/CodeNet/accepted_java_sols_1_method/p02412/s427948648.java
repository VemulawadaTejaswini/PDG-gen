import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int sum=0;
            int count=0;

            if((n==0 && x==0) || n<3) break;

            int i,j,k;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    for(k=1;k<=n;k++)
                    {
                        sum = i+j+k;
                        if(sum==x && (i<j && j<k))
                        {
                            count++;
                            //System.out.printf("%d+%d+%d=%d\n",i,j,k,sum);
                        }
                    }
                }
            }
            System.out.println(count);
        }

        sc.close();
    }
}
