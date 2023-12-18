import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n;
            int x;
            int count = 0;
            n = sc.nextInt();
            x = sc.nextInt();
            if(n==0&&x==0)return;
            for(int i=1;i<x/3;i++)
            {
                for(int j=i;j<x/2;j++)
                {
                    for(int k = j;k<x;k++)
                    {
                        if(i+j+k==n)
                        {
                            count++;
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
        }
	}
}