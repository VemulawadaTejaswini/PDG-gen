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
        int x=sc.nextInt();
        int y = sc.nextInt();

        int min = 2*x;
        int max= 4*x;
        if(y%2!=0)
        {
            System.out.println("No");
        }
        else if(y<min||y>max)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }

    }
}
