import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;++i) list.add(sc.nextInt());

        for (int i=0;i<n;++i)
        {
            int pi = list.get(i);
            if (i == 0)
            {
                ++count;
            }
            else if (pi <= min)
            {
                ++count;
            }

            if (min > pi) min = pi;

            //System.out.println("pi="+pi + " min = "+min);
        }
        System.out.println(count);
        sc.close();
    }
}