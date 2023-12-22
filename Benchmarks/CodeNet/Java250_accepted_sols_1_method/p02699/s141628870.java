
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int S  =  in.nextInt();
        int W =   in.nextInt();

        if(S<=W)
        {
            System.out.println("unsafe");
        }

        else
            {
                System.out.println("safe");
            }
 }

    }








