
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int bill = 1000;

        if (N%bill==0)
        {
            System.out.println(0);

        }
        else
            {
          int no_of_notes = N/bill+1;
          System.out.println(no_of_notes*1000-N);
        }

            }
    }