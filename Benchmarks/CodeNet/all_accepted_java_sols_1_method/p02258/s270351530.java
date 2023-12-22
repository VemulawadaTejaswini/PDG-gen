import java.util.*;


class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] in = new int[n];
        for(int i=0;i<n;i++) in[i] = sc.nextInt();
        int mx = Integer.MIN_VALUE;
        int mn=in[0];
        for(int i = 1; i<n;i++)
        {
            if(mx<in[i]-mn)
            {
                mx = in[i]-mn;
            }
            if(mn>in[i]) mn = in[i];
        }
        System.out.println(mx);
    }
}   



