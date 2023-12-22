import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        int max = 0;
        for (int i = 0;i<3;++i)
        {
            String ss = s.substring(i,i+1);
            if (ss.equals("R")) ++count;
            else
            {
                max = Math.max(count,max);
                count = 0;
            }
        }
        max = Math.max(count,max);
        System.out.println(max);
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}