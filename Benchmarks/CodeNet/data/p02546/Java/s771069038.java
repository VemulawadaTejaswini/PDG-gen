import java.util.*;
import java.lang.*;
import java.io.*;

public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String  s = in.next();
        if(s.charAt(s.length()-1)=='s') {
           System.out.println(s+"es");
        } else
          System.out.println(s+"s");


    }
}