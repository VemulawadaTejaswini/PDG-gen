import java.io.*;
import java.util.*;

class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        //--------------------------START CODING HERE-----------------------------

        StringTokenizer st = new StringTokenizer(f.readLine());
        int N = Integer.parseInt(st.nextToken());



        for(int i = 1; i <= N; i++)
        {
            int counter = 0;
            int x = 1;
            int y = 1;
            int z = 1;

            for(x = 1; Math.pow(x,2)<= i; x++)
            {
                for(y = 1; Math.pow(x,2)+Math.pow(y,2)+x*y <= i; y++)
                {
                    for(z = 1; Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)+x*y+y*z+z*x <= i; z++)
                    {
                        if(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)+x*y+y*z+z*x == i)
                        {
                            counter++;
                        }
                    }
                }
            }
            System.out.println(counter);
        }


        out.close();
    }
}