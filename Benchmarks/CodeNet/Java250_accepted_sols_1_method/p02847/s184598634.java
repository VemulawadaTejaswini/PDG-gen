
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        String[]  Day = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] x = new int[]{7, 6, 5, 4, 3, 2, 1};
        for(int i = 0; i<7; i++)
        {
            if(S.equals(Day[i])){
                System.out.println(x[i]);
            }
        }







        }







    }














