import java.util.*;

public class Main
{
    static String ans;
    static int array[]=new int[10];
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=0;i<n;++i)
        {
            for (int j=0;j<10;++j) { array[j]=sc.nextInt();}
            ans="YES";
            calc();
        }
    }

    public static void calc()
    {
        int a=0;
        int b=0;
        for (int i=0;i<10;++i)
        {
            if (array[i]>a){ a=array[i];}
            else if(array[i]>b) {b=array[i];}
            else { ans="NO";}
        }
        System.out.println(ans);
    }

}
