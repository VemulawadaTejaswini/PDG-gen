import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,num,rem;
        n=in.nextInt();
        num=n;
        while(num!=0)
        {
            rem=num%10;
            if(rem==7)
            {
                System.out.println("Yes");
                System.exit(0);
            }
            num=num/10;
        }
        System.out.println("No");
    }
}
