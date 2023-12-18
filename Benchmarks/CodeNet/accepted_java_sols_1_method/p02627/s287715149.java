
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.next();
        char ch = str.charAt(0);
        

        if(isUpperCase(ch)==true)
        {
            System.out.println('A');
        }
        else
            {
                System.out.println('a');
            }
    }

}
