import java.util.*;
import java.io.*;
public class Main {
    public static void main (String [] args) throws IOException 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int len = Integer.parseInt(in.readLine());

        StringTokenizer s = new StringTokenizer(in.readLine());

        boolean isZero = false;
        boolean tooLong = false;
        long[] nums = new long[len];
        for(int i = 0; i < len; i++)
        {
            nums[i] = Long.parseLong(s.nextToken());
            if(nums[i] == 0)
            {
                isZero = true;
            }
        }
        long result = 1;
        
        for(int i = 0; i < len && !isZero; i++)
        {
            if(1000000000000000000L/nums[i] >= result)
            {
                result *= nums[i];
            }
            else
            {
                tooLong = true;
                break;
            }
        }

        if(isZero)
        {
            System.out.println(0);
        }
        else if(tooLong)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(result);
        }
        in.close();
    }
}