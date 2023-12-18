import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        //String ans="even";

        int n=sc.nextInt();
        ++n;
        int c=sc.nextInt();
        int sum=0;
        for (int i=0;i<c;++i) { sum+=sc.nextInt();}

        if (sum%n==0){ ans=sum/n;}
        else {ans=sum/n+1;}

        System.out.println(ans);
    }
}
