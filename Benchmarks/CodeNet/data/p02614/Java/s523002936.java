import java.util.*;
import java.io.*;


class Main {

    public static void main(String[] args) throws IOException
    {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st1.nextToken());
        int w = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());

        char grid[][] = new char[h][w];

        for(int i = 0 ; i < h ; i++)
        {
            grid[i] = br.readLine().toCharArray();
        }
        int cnt = 0;
        for(int i = 0 ; i < Math.pow(2 , h) ; i++)
        {

            for(int j = 0 ; j < Math.pow(2 , w) ; j++)
            {
                int sum = 0;
                for(int x = 0 ; x < h ; x++)
                {
                    if((i & 1 << x) != 0) {
                        for (int y = 0; y < w; y++) {
                            if((j & 1 << y) != 0) {
                                if(grid[x][y] == '#')
                                {
                                    sum++;
                            }
                            }
                        }
                    }
                }
                if(sum == k)
                    cnt++;
            }
        }
        out.println(cnt);

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
