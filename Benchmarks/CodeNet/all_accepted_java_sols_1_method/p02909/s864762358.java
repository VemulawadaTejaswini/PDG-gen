
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        String[] w  = new String[]{"Sunny" , "Cloudy" , "Rainy"};
        String[] w1 = new String[]{"Cloudy" , "Rainy" , "Sunny"};
        for (int i = 0; i<3; i++)
        {
            if(S.equals(w[i]))
            {
                System.out.println(w1[i]);
            }
        }






        }







    }














