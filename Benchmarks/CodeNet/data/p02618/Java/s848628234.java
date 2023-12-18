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

        //System.err.println(debug.toString());

        Map<Integer,Integer> lastDay = new HashMap<>();//contestType,lastDay
        for (int type = 0;type < 26;++type) lastDay.put(type,0);

        long satisfaction = 0L;
        for (int date = 0;date < period;++date)
        {
            //select
            long maxSatisfaction = Long.MIN_VALUE;
            int bestContestType = -1;
            long minus = 0L;
            for (int type = 0;type < 26;++type)
            {
                long tmp = satisfaction + score[date][type];
                long tmp2 = 0L;
                for (int type2 = 0;type2 < 26;++type2)
                {
                    tmp2 += cost[type2] * ((date+1) - lastDay.get(type2));
                }
                tmp -= tmp2;

                if (maxSatisfaction < tmp)
                {
                    maxSatisfaction = tmp;
                    bestContestType = type;
                    minus = tmp2;
                }
            }
            //calc
            satisfaction += maxSatisfaction;
            lastDay.put(bestContestType,(date+1));
            satisfaction -= minus;

            //output
            System.out.println(bestContestType+1);
        }
        sc.close();
    }
}