import java.io.*;
import java.util.*;


public class Main implements Runnable {

    public void run() {
       	
        InputReader sc = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
 
        int n=sc.nextInt();
        int m=sc.nextInt();
        int kkk=sc.nextInt();
        char a[][]=new char[n][m];
        long ans=0;
        int sum=0;
        // int row[]=new int[n];
        // int col[]=new int[m];
        
        for(int i=0;i<n;i++) a[i]=sc.next().toCharArray();
        
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]=='#')
                {
                    //row[i]++;
                   // col[j]++;
                    sum++;
                }
            }
        }

        
        for(int i=0;i<1<<n;i++)
        {
           // int tmp=0;
            ArrayList<Integer> rows=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if(((i>>j)&1)==1)
                {
                    //tmp+=row[j];
                    rows.add(j);
                }
            }

            for(int k=0;k<1<<m;k++)
            {
                ArrayList<Integer> cols=new ArrayList<>();
                for(int l=0;l<m;l++)
                {
                    if(((k>>l)&1)==1)
                    {
                        //tmp+=col[l];
                        cols.add(l);
                    }
                }
                if(fun(rows,cols,a,kkk,sum,n,m)) ans++;
            }
        }
        out.println(ans);
        out.close();
    }
    
    static boolean fun(ArrayList<Integer> rows,ArrayList<Integer> cols,char a[][],int k,int sum,int n,int m)
    {
        int ans=0;
        boolean vis[][]=new boolean[n][m];

        for(int col:cols)
        {
            for(int i=0;i<n;i++)
            {
                if(!vis[i][col])
                {
                    vis[i][col]=true;
                    if(a[i][col]=='#') ans++;
                }       
            }
        }
        for(int row:rows)
        {
            for(int i=0;i<m;i++)
            {
                if(!vis[row][i])
                {
                    vis[row][i]=true;
                    if(a[row][i]=='#') ans++;
                }       
            }
        }
        
        return sum-ans==k;
    }

//========================================================================

	
	static void sa(int a[],InputReader sc)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
        Arrays.sort(a);
	}

	static class pair<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<pair<U, V>> {
        public U x;
        public V y;

        public pair(U x, V y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(pair<U, V> other) {
            int i = x.compareTo(other.x);
            if (i != 0) return i;
            return y.compareTo(other.y);
        }

        public String toString() {
            return x.toString() + " " + y.toString();
        }

        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass()) return false;
            pair<U, V> other = (pair<U, V>) obj;
            return x.equals(other.x) && y.equals(other.y);
        }

        public int hashCode() {
            return 31 * x.hashCode() + y.hashCode();
        }

    }


    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        public InputReader(InputStream stream) {
            this.stream = stream;
        }
       
        public int read() {
            if (numChars==-1)
                throw new InputMismatchException();
           
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                }
                catch (IOException e) {
                    throw new InputMismatchException();
                }
               
                if(numChars <= 0)              
                    return -1;
            }
            return buf[curChar++];
        }
     
        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        public int nextInt() {
            int c = read();
           
            while(isSpaceChar(c))
                c = read();
           
            int sgn = 1;
           
            if (c == '-') {
                sgn = -1;
                c = read();
            }
           
            int res = 0;
            do {
                if(c<'0'||c>'9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
           
            return res * sgn;
        }
       
        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
           
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
                return res * sgn;
        }
       
        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
       
        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));
           
            return res.toString();
        }
     
        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
     
        public String next() {
            return readString();
        }
       
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception {
        new Thread(null, new Main(),"Main",1<<27).start();
    }
}
