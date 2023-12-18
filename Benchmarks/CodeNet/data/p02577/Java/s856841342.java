import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        long n=sc.nextLong();
        long sum=0;
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        if(sum%9==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
