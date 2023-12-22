import java.util.*;
class Main
{
    public static void main(String arg[])
    {
        int count=0,s,n1;
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int b= sc.nextInt();
            if(b>0&&b<=10)
            {
                while(n>0)
                {
                    s=n%b;
                    n=n/b;
                    count++;
                }
            }
        } catch(Exception e) {
        } 
        System.out.println(count);
    }
}