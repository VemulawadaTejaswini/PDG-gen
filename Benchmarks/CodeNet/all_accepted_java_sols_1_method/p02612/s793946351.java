import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int c = t/1000;
        if(t%1000!=0)
            c++;
        System.out.println(c*1000-t);
    }
}
