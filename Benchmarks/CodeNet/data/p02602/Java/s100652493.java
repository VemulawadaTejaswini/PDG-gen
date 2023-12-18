import javax.sound.midi.Soundbank;
import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[t];
        for(int i=0; i<t; i++)
        {
            a[i] = s.nextInt();
            if(i>=k)
            {
                if(a[i]>a[i-k])
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
