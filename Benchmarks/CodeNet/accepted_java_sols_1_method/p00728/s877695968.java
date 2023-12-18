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
            int s[] = new int[n];

            int max=0;
            int min=10000;
            int total=0;

            for(int i=0; i<s.length; i++)
            {
                s[i] = sc.nextInt();
                if(s[i]>max) max=s[i];
                if(s[i]<min) min=s[i];
                total+=s[i];
            }
            total -= (min+max);

            System.out.printf("%d\n",(int)((double)total/(n-2)));
        }
        sc.close();
    }
}
