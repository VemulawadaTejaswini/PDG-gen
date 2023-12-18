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
        long debugSumCost = 0L;
        for (int i = 0;i<cost.length;++i)
        {
            cost[i] = sc.nextInt();
            debug.append(cost[i]+" ");
            debugSumCost += cost[i];
        }
        debug.append("\n");
        //System.err.println("debugSumCost = "+debugSumCost);

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
            for (int type = 0;type < 26;++type)
            {
                long tmpSatisfaction = satisfaction + score[date][type];
                long tmpMinus = 0L;
                for (int t = 0;t < 26;++t)
                {
                    if (type == t) continue;
                    tmpMinus += cost[t] * ((date+1) - lastDay.get(t));
                }
                tmpSatisfaction -= tmpMinus;

                if (maxSatisfaction < tmpSatisfaction)
                {
                    maxSatisfaction = tmpSatisfaction;
                    bestContestType = type;
                }
            }
            System.err.println(maxSatisfaction);

            //calc
            satisfaction = maxSatisfaction;
            lastDay.put(bestContestType,(date+1));

            //output
            System.out.println(bestContestType+1);
        }
        System.err.println(satisfaction);
        sc.close();
    }
}