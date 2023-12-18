import java.io.*;
import java.util.*;

class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        //--------------------------START WRITING HERE-----------------------------

        StringTokenizer st = new StringTokenizer(f.readLine());

        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int counter = 0;
        for(int i = L; i <= R; i++)
        {
            if(i%d==0)counter++;
        }

        out.println(counter);

        out.close();
    }
}