import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        //--------------------------START CODING HERE-----------------------------

        StringTokenizer st = new StringTokenizer(f.readLine());
        int DA  = Integer.parseInt(st.nextToken());

        int i = 0;
        while(Math.pow(26,i) <= DA)
        {
            i++;
        }
        i--;

        String str = "";
        for(int pow = i; pow >= 0; pow--)
        {
             char theChar = (char)((DA/Math.pow(26,pow))+'a'-1);
             str+= Character.toString(theChar);
             DA = DA % (int)Math.pow(26,pow);
        }
        out.print(str);

        out.close();
    }
}