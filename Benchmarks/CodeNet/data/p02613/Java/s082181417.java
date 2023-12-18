import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int AC = 0;
        int WA = 0;
        int TLE = 0;
        int RE = 0;

        for(int i=0;i<N;i++)
        {
            String result = sc.next();
            if(result.equals("AC"))
                AC++;
            else if(result.equals("WA"))
                WA++;
            else if(result.equals("TLE"))
                TLE++;
            else
                RE++;
        }

        System.out.println("AC x " + AC);
        System.out.println("WA x " + WA);
        System.out.println("TLE x " + TLE);
        System.out.println("RE x " + RE);
    }
}
