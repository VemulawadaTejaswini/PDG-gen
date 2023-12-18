import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int cnt=-1,ans=0;
       for(int i=1; i<=n; i++ )
       {
            int temp=i;
            int cnt1=0;
            while(temp%2==0)
            {
                temp/=2;
                cnt1++;
            }
            if(cnt1>=cnt)
            {
                cnt=cnt1;
                ans=i;
            }
        }
        System.out.println(ans);         
    }

    
}