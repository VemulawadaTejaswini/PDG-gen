/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
        public static void main (String[]args)
        {
            // your code goes here
            Scanner s = new Scanner(System.in);
            int k = s.nextInt();
            String str = s.next();
            if(str.length()<=k)
                System.out.println(str);
            else
            {
                for(int i=0; i<k; i++)
                {
                    System.out.print(str.charAt(i));
                }
                System.out.print("..."+'\n');
            }


        }
}
