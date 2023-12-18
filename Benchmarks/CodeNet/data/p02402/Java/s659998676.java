import java.io.*;
import java.util.Arrays;

class Main{
    public static void main (String[ ] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String str = br.readLine();

        int min = 1000001, max = -1000001;
        long sum = 0;
        String[] strArr = str.split(" ");
        for(String str : strArr)
        {
            int i = Integer.parseInt(str);
            if(i < min)
            {
                min = i;
            }
            if(i > max)
            {
                max = i;
            }
            sum += i;
        }
        
        System.out.println(min + " " + max + " " + sum);
    }
}