import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //int ans=0;
        String ans="even";

        int hi=sc.nextInt();
        int hy=sc.nextInt();
        int ki=sc.nextInt();
        int ky=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        int hirosiP=(a*hi)+(b*hy)+(hi/10*c)+(hy/20*d);
        int kenjiroP=(a*ki)+(b*ky)+(ki/10*c)+(ky/20*d);

        if (hirosiP>kenjiroP) {ans="hiroshi";}
        else if (kenjiroP>hirosiP) {ans="kenjiro";}
        System.out.println(ans);
    }
}
