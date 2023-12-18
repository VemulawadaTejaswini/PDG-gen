import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;
public class Main {
	static int[][] next = {{0, 1},{1, 0},{-1, 0},{0, -1}};
 
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		InputReader in = new InputReader();
		while(true) {
			int ans = 0;
			 int n = in.nextInt();
			 int m = in.nextInt();
			 if(n == 0 && m == 0) break;
			 char[][] s = new char[n][m];
			 for(int i = 0; i < n; i ++) {
				 char[] tmp =in.next().toCharArray();
				 for(int j = 0; j < m; j ++) {
					 s[i][j] = tmp[j];
				 }
			 }
	 
			 for(int i = 0; i < n; i ++) {
				 for(int j = 0; j < m; j ++) {
					if(s[i][j] != '.') {
						dfs(s, i, j );
						ans ++ ;
					}
				 }
			 }
			 System.out.println(ans);
		}
		
	}
	public static void dfs (char[][] s, int x, int y ) {
		char tmp = s[x][y];
		s[x][y] = '.';
		for(int k = 0; k < 4; k ++) {
			int nx = next[k][0] + x;
			int ny = next[k][1] + y;
			if(nx < 0 || nx >= s.length || ny < 0  || ny >= s[0].length) {
				continue;
			}
			if(s[nx][ny] == tmp) {
				dfs(s, nx, ny);
			}
		}
	}
 
}
class InputReader
{
    BufferedReader buf;
    StringTokenizer tok;
    InputReader()
    {
        buf = new BufferedReader(new InputStreamReader(System.in));
    }
    boolean hasNext()
    {
        while(tok == null || !tok.hasMoreElements()) 
        {
            try
            {
                tok = new StringTokenizer(buf.readLine());
            } 
            catch(Exception e) 
            {
                return false;
            }
        }
        return true;
    }
    String next()
    {
        if(hasNext()) return tok.nextToken();
        return null;
    }
    int nextInt()
    {
        return Integer.parseInt(next());
    }
    long nextLong()
    {
        return Long.parseLong(next());
    }
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
    BigInteger nextBigInteger()
    {
        return new BigInteger(next());
    }
    BigDecimal nextBigDecimal()
    {
        return new BigDecimal(next());
    }
}
