import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a=n/2;
        if(n%2==1)
            a+=1;
        if(k>a)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}