import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        int m=sc.nextInt();
        int f=sc.nextInt();
        int b=sc.nextInt();

        if (b-m<=0) { ans=0; }
        else if (m+f<b) {System.out.println("NA"); System.exit(0);}
        else { ans=b-m; }

        System.out.println(ans);
    }
}
