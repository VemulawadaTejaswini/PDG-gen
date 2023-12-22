import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int a,b,c,x;
        int output=0;
        int i,j,k;
        int ac,bc,cc;

        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        x=scan.nextInt();

        for(i=0;i<=a;i++)
        {   
            for(j=0;j<=b;j++)
            {
                for(k=0;k<=c;k++)
                {
                    ac=500*i;
                    bc=100*j;
                    cc=50*k;
                    if(ac+bc+cc==x)
                    {
                        output++;
                    }

                }
            }
        }
        System.out.println(output);
    } 
}