import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int c = 0;
        for(int i=0; i<n; i++)
        {
            a[i] = s.nextInt();
            if(a[i]%2==0)
                c++;
        }
        int ch=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]%2==0)
            {
                if(a[i]%3==0||a[i]%5==0)
                {
                    ch++;
                }
            }
        }
        if(ch==c)
        {
            System.out.println("APPROVED");
        }
        else System.out.println("DENIED");
        }
    }