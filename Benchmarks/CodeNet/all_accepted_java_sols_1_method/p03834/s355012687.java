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
        String s=sc.next();
        int c=-1;
        int cc=-1;

        for (int i=0;i<s.length();++i)
        {
            String ss = s.substring(i,i+1);
            if (ss.equals(","))
            {
                if (c==-1)
                {
                    c=i;
                }else
                {
                    cc=i;
                }
            }
        }

        String ans1 = s.substring(0,c);
        String ans2 = s.substring(c+1,cc);
        String ans3 = s.substring(cc+1,s.length());

        System.out.println(ans1+" "+ans2+" "+ans3);
    }
}