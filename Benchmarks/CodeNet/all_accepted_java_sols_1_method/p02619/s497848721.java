import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        StringBuilder debug = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int period = sc.nextInt();//D
        debug.append(period+"\n");

        int[] cost = new int[26];//c
        for (int i = 0;i<cost.length;++i)
        {
            cost[i] = sc.nextInt();
            debug.append(cost[i]+" ");
        }
        debug.append("\n");

        int[][] score = new int[period][26];//s
        for (int i = 0;i<score.length;++i)
        {
            for (int j = 0;j<score[i].length;++j)
            {
                score[i][j] = sc.nextInt();
                debug.append(score[i][j]+" ");
            }
            debug.append("\n");
        }

        int[] contestTypes = new int[period];//t
        for (int i = 0;i<contestTypes.length;++i)
        {
            contestTypes[i] = sc.nextInt() - 1;
            debug.append(contestTypes[i]+"\n");
        }
        //System.err.println(debug.toString());

        Map<Integer,Integer> lastDay = new HashMap<>();//contestType,lastDay
        for (int type = 0;type < 26;++type) lastDay.put(type,0);

        long satisfaction = 0L;
        for (int date = 0;date < period;++date)
        {
            satisfaction += score[date][contestTypes[date]];
            lastDay.put(contestTypes[date],(date+1));

            long minus = 0L;
            for (int type = 0;type < 26;++type)
            {
                minus += cost[type] * ((date+1) - lastDay.get(type));
            }
            satisfaction -= minus;
            System.out.println(satisfaction);
        }
        sc.close();
    }
}