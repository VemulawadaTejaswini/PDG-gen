import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        for (int i = 0;i<n;++i) a.add(sc.nextLong());
        Collections.sort(a,Collections.reverseOrder());

        StringBuilder stb = new StringBuilder();
        for (long e:a) stb.append(e+",");
        System.err.println(stb.toString());

        List<Long> retu = new ArrayList<>();
        long score = 0;
        for (int i = 0;i<a.size();++i)
        {
            long ae = a.get(i);
            if (retu.size() == 0)
            {
                retu.add(ae);
            }else
            {
                score += retu.get(i-1);
                retu.add(ae);
            }
            System.err.println(score);
        }
        System.out.println(score);
        sc.close();
    }
}