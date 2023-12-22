/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main {
    public static void main (String[] args) {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int j = 0;
        for(int i=0; i<5; i++)
        {
            int x = s.nextInt();
            if(x==0)
                j=i+1;
        }
        System.out.println(j);

    }
}
