
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        boolean playable = true;

        for(int i =0 ; i<S.length() ; i++)
        {
            int x =  (i+1)%2;

            if(x==1)
            {
                if(S.charAt(i)=='R'|| S.charAt(i)=='U'||S.charAt(i)=='D' )
                {
                }
                else {
                    playable = false;
                }
            }
            else if(x==0)
            {
                if(S.charAt(i)=='L'|| S.charAt(i)=='U'||S.charAt(i)=='D' )
                {
                }
                else {
                    playable=false;
                }
            }


        }
                if(playable==true)
                {
                    System.out.println("Yes");
                }
                else
                    {
                        System.out.println("No");
                    }








        }







    }














