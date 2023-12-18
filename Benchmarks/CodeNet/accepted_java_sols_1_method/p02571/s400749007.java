import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        int min = t.length();

        for (int i = 0;i<s.length() - t.length() + 1;++i)
        {
            int count = t.length();
            String tmp = s.substring(i,i+t.length());
            System.err.println(tmp);
            for (int j = 0;j<t.length();++j)
            {
                String ss = tmp.substring(j,j+1);
                String tt = t.substring(j,j+1);
                if (ss.equals(tt)) --count;
            }

            if (min > count) min = count;
        }
        System.out.println(min);

//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}