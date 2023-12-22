
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] S = new String[100];
        // ["", "","" ,"" ,"", ... ]
        // [0, 0, 0, 0, 0, ... ]
        // "" - String, '' - Char

        int[] iVal = new int[5]; // [0, 0, 0, 0, 0]
        // iVal = [0,1,2,3,4]

        // iVal = [3, 5, 7, 9, 11]

        for(int i = 0; i < 5; i+=1) {

            iVal[i] = in.nextInt();
            if(iVal[i]==0)
            {
                System.out.println(i+1);
            }


        }

        }









    }



