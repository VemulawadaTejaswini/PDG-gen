import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //Compute c1 = new Compute();//calc

        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();

        //input
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans[]={"Yes","No"};

        String ss[]=new String[s.length()];
        for (int i=0;i<s.length();++i) ss[i]=s.substring(i,i+1);
        int p1=0;
        int p2=0;

        for (int i=0;i<s.length();++i)
        {
            //System.out.println(i+1);
            //System.out.println(ss[i]);
            if ((i+1)%2==1)
            {
                if (ss[i].equals("L"))
                {
                    p1=1;
                    //System.out.println("hit1" + (i+1));
                }
            }else
            {
                if (ss[i].equals("R"))
                {
                    p2=1;
                    //System.out.println("hit2" + (i+1));
                }
            }
            //System.out.println("------------------");
        }

        if (p1!=1 && p2!=1) System.out.println(ans[0]);
        else System.out.println(ans[1]);
    }
}