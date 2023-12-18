import javax.sound.midi.Soundbank;
import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = s.nextInt();
        int c = 0;
        for(int i=0; i<n; i++)
        {
            int x = s.nextInt();
            int y = s.nextInt();
            double distsq = Math.pow(x,2)+Math.pow(y,2);
            if(distsq<=Math.pow(d,2))
                c++;
        }
        System.out.println(c);

    }
}
