import javax.sound.midi.Soundbank;
import java.util.*;
import java.lang.*;

public class Main
{
    static boolean isThere(int[] a, int x)
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==x)
                return true;
        }
        return false;
    }
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0, w = 0, t = 0, r = 0;
        for(int i=0; i<n; i++)
        {
            String x = s.next();
            if(x.equals("AC"))
                a++;
            else if(x.equals("WA"))
                w++;
            else if(x.equals("TLE"))
                t++;
            else if(x.equals("RE"))
                r++;
        }
        System.out.println("AC x "+a);
        System.out.println("WA x "+w);
        System.out.println("TLE x "+t);
        System.out.println("RE x "+r);
    }
}
