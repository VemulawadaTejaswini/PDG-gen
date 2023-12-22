import java.util.*; 
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int k;
        k=in.nextInt();
        int a,b,i,num;
        a=in.nextInt();
        b=in.nextInt();
        num=a;
        for(i=num;i<=b;i++,num++)
        {
            if(i%k==0)
            {
                System.out.println("OK");
                System.exit(0);
            }
        }
        System.out.println("NG");
    }
}