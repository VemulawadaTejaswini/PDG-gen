import java.util.*;
public class Main {
    
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};
    public static void dfs(int x, int y, char[][] region, int n, int m)
    {
        char c = region[x][y];
        region[x][y] = 'x';
        
        for(int i=0;i<4;i++)
        {
            int new_x = x + dx[i];
            int new_y = y + dy[i];
            if(new_x >= 0 && new_x < n && new_y >= 0 && new_y < m && region[new_x][new_y] == c)
            {
                dfs(new_x, new_y, region,n, m);
            }
        }
        
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            String temp = sc.nextLine();
            if(m==0&&n==0)
            {
                return;
            }
            // System.out.println(m+" "+n);
            char[][] region = new char[m][n];
            for(int i=0;i<m;i++)
            {
                // System.out.println(i);
                String line = sc.nextLine();
                // System.out.println(line);
                for(int j=0;j<n;j++)
                {
                    region[i][j] = line.charAt(j);
                }
            }
            
            int res = 0;
            for(int i=0;i<m;i++)
            {
                for(int j=0; j<n;j++)
                {
                    if(region[i][j] == 'x')
                        continue;
                    else
                    {
                        res += 1;
                        dfs(i,j, region, n, m);
                    }
                }
            }
            System.out.println(res);
        }
    }
}

