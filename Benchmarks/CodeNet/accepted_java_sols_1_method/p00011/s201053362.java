import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int w,n;
        w=sc.nextInt();
        n=sc.nextInt();
        int output[] = new int[w];
        for(int i=0; i<w; i++) output[i]=i+1;

        for(int i=0; i<n; i++)
        {
            String input = sc.next();
            String[] suuji = input.split(",");
            //System.out.println(suuji[1]);

            int a,b;
            a=Integer.parseInt(suuji[0]);
            b=Integer.parseInt(suuji[1]);

            
            //swap
            int c;
            c = output[a-1];
            output[a-1] = output[b-1];
            output[b-1] = c;
        }

        for(int i=0; i<w; i++) System.out.println(output[i]);
        sc.close();
    }
}
