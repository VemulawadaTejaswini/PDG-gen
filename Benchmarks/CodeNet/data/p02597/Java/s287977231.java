import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AlterAltar
{
    public static void main(String[] args) throws IOException
    {
        int N = readInt();
        char[] chs = br.readLine().toCharArray();

        int left = 0;
        int right = N - 1;
        int count = 0;

        while (left < right)
        {
            if (chs[left] == 'W')
            {
                if (chs[right] == 'R')
                {
                    left++;
                    right--;

                    count++;
                }
                else
                    right--;
            }
            else
                left++;
        }

        System.out.println(count);
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int readInt() throws IOException
    {
        while (st == null || !st.hasMoreTokens())
        {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}