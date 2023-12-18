

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String f,s;
        int a=0,b=0;
        for(int i = 0; i<n; i++)
        {
            f = sc.next();
            s = sc.next();
            if(f.compareToIgnoreCase(s)<0)
            {
                b+=3;
            }
            else if(f.compareToIgnoreCase(s)>0)
            {
                a+=3;
            }
            else
            {
                a++;
                b++;
            }
        }
        System.out.printf("%d %d\n",a,b);
    }
}
