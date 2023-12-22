import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskAtCoder solver = new TaskAtCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAtCoder
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            Map<String, Integer> map = new HashMap<>(N);
            for (int i = 0; i < N; i++)
            {
                String s = in.next();
                int occ = map.getOrDefault(s, 0);
                map.put(s, ++occ);
            }

            int max = Integer.MIN_VALUE;
            for (String s : map.keySet())
            {
                max = Math.max(max, map.get(s));
            }
            List<String> list = new ArrayList<>();
            for (String s : map.keySet())
            {
                if (map.get(s) == max) list.add(s);
            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++)
            {
                if (i == list.size() - 1)
                    out.print(list.get(i));
                else
                    out.println(list.get(i));
            }
        }

    }
}

