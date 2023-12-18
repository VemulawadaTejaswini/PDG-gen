import java.util.*;
import java.io.*;


class Main {

    public static void main(String[] args) throws IOException
    {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Long arr[] = new Long[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = Long.parseLong(st1.nextToken());
        }
        Arrays.sort(arr);
        long sum = arr[n-1];
        int ind = n-2;
        for(int i = 0 ; i < n-2 ; i++)
        {
            sum += arr[ind];

            if(i%2 != 0)
                ind--;
        }
        out.println(sum);

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
