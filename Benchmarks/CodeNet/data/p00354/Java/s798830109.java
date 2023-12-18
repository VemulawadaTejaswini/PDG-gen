import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String ans[]={"sat","sun","mon","tue","wed","thu","fri"};
        int x=sc.nextInt();
        int n=0;

        int a=Math.abs(x-9);

        if (x<9)
        {
            int b=a%7;
            if (b==0) {n=0;}
            else {n=ans.length-b;}
        }
        else { n=a%7; }

        System.out.println(ans[n]);
    }
}
