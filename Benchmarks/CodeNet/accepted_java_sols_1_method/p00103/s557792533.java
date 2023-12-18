
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Queue<Integer> qBase = new LinkedList<Integer>();
        BufferedReader bReader =
                       new BufferedReader(new InputStreamReader(System.in));
        int inningCount = Integer.parseInt(bReader.readLine());
        int calcCount = 0;
        int point = 0;
        int out = 0;
        qBase.offer(0);
        qBase.offer(0);
        qBase.offer(0);
        while ( calcCount != inningCount )
        {
            String inputStr = bReader.readLine();
            if ( inputStr.equals("HIT") )
            {
                point += qBase.peek();
                qBase.poll();
                qBase.offer(1);
            }
            else if ( inputStr.equals("HOMERUN") )
            {
                point += qBase.peek();
                qBase.poll();
                point += qBase.peek();
                qBase.poll();
                point += qBase.peek();
                qBase.poll();
                point += 1;
                qBase.offer(0);
                qBase.offer(0);
                qBase.offer(0);
            }
            else if ( inputStr.equals("OUT") )
            {
                out++;
                if ( out == 3 )
                {
                    System.out.println(point);
                    calcCount++;
                    out=0;
                    point = 0;
                    qBase.clear();
                    qBase.offer(0);
                    qBase.offer(0);
                    qBase.offer(0);
                }
            }
            else
            {
            }
        }
    }
}