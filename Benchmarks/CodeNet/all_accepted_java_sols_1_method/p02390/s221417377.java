import java.io.*;
import java.util.*;

class Main
{
    public static void main (String args[]) throws IOException         //?????????
    {
        InputStreamReader is = new InputStreamReader(System.in);       //?????????
        BufferedReader br = new BufferedReader(is);                    //?????????
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        int h = s / 3600;
        int m = (s % 3600) / 60;
        int sec = s % 60;

        System.out.println(h + ":" + m + ":" + sec);
    }
}
    