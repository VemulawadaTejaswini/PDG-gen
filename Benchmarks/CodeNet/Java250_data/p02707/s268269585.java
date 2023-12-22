import java.util.*;
import java.io.*;


class Main {

    public static void main(String[] args) throws IOException
    {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n+1];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n-1 ; i++)
        {
            int tmp = Integer.parseInt(st1.nextToken());
            arr[tmp]++;
        }
        for(int i = 1 ; i <= n ; i++)
            out.println(arr[i]);
        out.flush();
        out.close();

    }

    static class pair{
        long x1;
        long x2;

        public pair(long x1 , long x2)
        {
            this.x1 = x1;
            this.x2 = x2;
        }

    }

}
