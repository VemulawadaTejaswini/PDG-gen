import java.util.Scanner;
public class Main
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=a%k;
        int num=k-n;
        if(a+num<=b||n==0)
        System.out.println("OK");
        else
        System.out.println("NG");
    }
    
}
