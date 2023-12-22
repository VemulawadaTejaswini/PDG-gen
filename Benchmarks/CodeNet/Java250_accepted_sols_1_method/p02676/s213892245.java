import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int l=s.length();
        String k="";
        if(l<=n)
        System.out.println(s);
        
        else
        {
            for(int i=0;i<n;i++)
            {
                k=k+s.charAt(i);
            }
            k=k+"...";
            System.out.println(k);
        }
    }
}
