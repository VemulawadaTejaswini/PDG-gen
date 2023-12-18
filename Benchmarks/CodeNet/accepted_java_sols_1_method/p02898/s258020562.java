
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
         int N = in.nextInt();
         int K = in.nextInt();
         int[] h = new int[N];
         int count = 0;
         for(int i = 0; i<N;  i++)
         {
             h[i] = in.nextInt();
             if(h[i]>=K)
             {
                 count++;
             }

         }
        System.out.println(count);







    }







    }














