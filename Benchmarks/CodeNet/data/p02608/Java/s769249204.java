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

            int x2 = (int)Math.pow(x,2);
            for(x = 1; x2<= i; x++)
            {
                x2 = (int)Math.pow(x,2);

                int y2 = (int)Math.pow(y,2);
                for(y = 1; x2 +y2+x*y <= i; y++)
                {
                    y2 = (int)Math.pow(y,2);

                    int z2 = (int)Math.pow(z,2);
                    for(z = 1; x2+y2+z2+x*y+y*z+z*x <= i; z++)
                    {
                        z2 = (int)Math.pow(z,2);

                        if(x2+y2+z2+x*y+y*z+z*x == i)
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