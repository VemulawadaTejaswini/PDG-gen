import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        double d = Double.parseDouble(st.nextToken());

        long[][] points = new long[n][2];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            points[i][0] = Long.parseLong(st.nextToken());
            points[i][1] = Long.parseLong(st.nextToken());
        }
        int ans = 0;
        for (int i=0; i<n; i++) {
            if(Math.pow(points[i][0]*points[i][0]+points[i][1]*points[i][1],0.5)<=d)
                ans++;
        }

        out.println(ans);

        out.close();
    }
    

}

