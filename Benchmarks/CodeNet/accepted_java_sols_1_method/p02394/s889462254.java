import java.io.*;
import java.util.Arrays;

class Main{
    public static void main (String[ ] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String str = br.readLine();

        String[] strarr = str.split(" ");
        int w = Integer.parseInt(strarr[0]);
        int h = Integer.parseInt(strarr[1]);
        int x = Integer.parseInt(strarr[2]);
        int y = Integer.parseInt(strarr[3]);
        int r = Integer.parseInt(strarr[4]);
        
        if(((0 <= (x - r)) && ((x + r) <= w)) && ((0 <= (y - r)) && ((y + r) <= h)))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}