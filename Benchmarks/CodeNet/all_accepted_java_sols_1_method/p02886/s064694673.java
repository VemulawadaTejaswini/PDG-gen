
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] d = new int[N];
        int product = 0 ;
        for(int i =0 ; i< N; i++)
        {
            d[i]=in.nextInt();
        }


            for (int i = 0; i<N; i++)
        {
            for(int j=i+1; j<N; j++)
            {
                product = product + d[i]*d[j];

             }
        }
              System.out.println(product);





    }







    }















