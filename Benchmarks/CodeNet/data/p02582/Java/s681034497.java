import java.util.Scanner;
import java.awt.image.BandedSampleModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.equals("RRR"))
        {
            System.out.println(3);
        }
        else  if(s.equals("SRR")||s.equals("RRS"))
        {
            System.out.println(1);
        }
        else if(s.equals("SSS"))
        {
            System.out.println(0);
        }
        else 
        {
            System.out.println(2);
        }

    }
}
