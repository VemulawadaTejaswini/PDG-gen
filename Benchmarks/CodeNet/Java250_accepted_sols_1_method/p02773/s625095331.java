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
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<n;++i)
        {
            String s=sc.next();
            if (map.containsKey(s))
            {
                int c = map.get(s);
                c++;
                map.put(s,c);
                if (c > max) max=c;
            }else
            {
                int c = 1;
                map.put(s,c);
                if (c > max) max=c;
            }
        }

        Set<String> set = new HashSet<>();
        for (String s:map.keySet())
        {
            int c = map.get(s);
            if (c==max) set.add(s);
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        for (String s:list) System.out.println(s);

        sc.close();
    }
}