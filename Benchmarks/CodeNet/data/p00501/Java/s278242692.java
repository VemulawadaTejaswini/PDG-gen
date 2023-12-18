import java.util.*;
import java.text.StringCharacterIterator;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final String alternate = sc.next();
        int count = 0;
        for(int i = 0; i < N; ++i)
        {
            final String old = sc.next();
            int[] dif = new int[alternate.length()];
            for(int ai = 0, oi = 0; ai < alternate.length() && oi < old.length(); ++oi)
            {
                if(alternate.charAt(ai) == old.charAt(oi))
                {
                    if(ai == alternate.length() - 1)
                    {
                        ++count;
                        break;
                    }
                    if(ai == 0)
                    {
                        dif[0] = oi;
                    }
                    else
                    {
                        dif[ai] = oi - dif[ai - 1] - 1;
                        if(dif[ai] != dif[ai - 1])
                        {
                            break;
                        }
                    }
                    ++ai;
                }
            }
        }
        System.out.println(count);
    }
}