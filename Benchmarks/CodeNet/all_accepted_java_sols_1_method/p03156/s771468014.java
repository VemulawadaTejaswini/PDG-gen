import java.util.*;
class Main
{
	
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in); 
        int n = s.nextInt();
        int[] a = new int[n];
        int A = s.nextInt();
        int B = s.nextInt();
        int o =0,p=0,m=0;
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
            if(a[i]<=A)
            {
                o++;
            }
            else if(a[i]<=B)
            {
                p++;
            }
            else
            {
                m++;
            }
        }
        System.out.println(Math.min(Math.min(o,p),m));

    }    



    
    
}

