import java.util.*;
class tdo 
{
    public static void main(String []args)
    {
        int n,res=0;
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();

        if(n>=400 && n<=599)
            res=8;
        if(n>=600 && n<=799)
            res=7;
        if(n>=800 && n<=999)
            res=6;
        if(n>=1000 && n<=1199)
            res=5;
        if(n>=1200 && n<=1399)
            res=4;
        if(n>=1400 && n<=1599)
            res=3;
        if(n>=1600 && n<=1799)
            res=2;
        if(n>=1800 && n<=1999)
            res=1;
        System.out.print(res);
    }
}