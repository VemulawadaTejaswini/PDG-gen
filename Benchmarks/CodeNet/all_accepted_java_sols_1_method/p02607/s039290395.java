import java.io.*;
import java.util.*;

class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        //--------------------------START CODING HERE-----------------------------

        StringTokenizer st = new StringTokenizer(f.readLine());

        int N = Integer.parseInt(st.nextToken());

        String[] strings = f.readLine().split(" ");
        int counter = 0;
        for(int i = 0; i < N; i++)
        {
            if(i%2==0)if((Integer.parseInt(strings[i])%2) == 1)counter++;
        }
        out.println(counter);
        out.close();
    }
}