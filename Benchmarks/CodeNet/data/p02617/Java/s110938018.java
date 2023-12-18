import java.util.*;
import java.io.*;


class Main {

    public static void main(String[] args) throws IOException
    {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long numEdges = 0l;
        long numVertices = 0l;

        for(int i = 0 ; i < n-1 ; i++)
        {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            long x1 = Long.parseLong(st1.nextToken());
            long x2 = Long.parseLong(st1.nextToken());
            long tmp = Math.min(x1 , x2);
            x2 = Math.max(x1 , x2);
            x1 = tmp;
            numEdges += x1*(1l*n-x2+1l);
            numVertices += (1l*i+1l)*(1l*n-1l*(i+1l) + 1l);
        }
        numVertices += n*1l;


        out.println(numVertices -numEdges);

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
