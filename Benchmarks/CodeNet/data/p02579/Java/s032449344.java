//JAI BAJRANGBALI                                                                                                                                               
import java.util.*;
import java.io.*;
import java.math.BigInteger;
class Main
{
    public final static int d = 256; 
    static int MOD = 1000000007;
    static final float EPSILON = (float)0.01; 
    static final double PI = 3.1415926536;
    private static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
    private static BufferedWriter out = new BufferedWriter (new OutputStreamWriter (System.out));
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st;   
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
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
  
        String nextLine() 
        {
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
    static class Cell{
        int X , Y , dis;
        Cell(int x , int y , int di){
            X = x;
            Y = y;
            dis = di;
        }
    }
    static boolean isValid(int x , int y , int N , int M){
        return ((x >= 0 && x < N) &&(y >= 0 && y < M));
    }
    boolean doesNeighbourExist(int i , int j , int N , int M , int arr[][]){
        int ii = i - 2 , jj = j - 2 , f = 1;
        for(int x = ii ; x < ii + 5 ; x++){
            for(int y = jj ; y < jj + 5 ; y++){
                if(isValid(x , y , N , M) && arr[x][y] == '.'){
                        f = 0;
                        return true;
                    }
                }
            }
        return false;
    }        
    static int searchRabinKarp(String pat, String txt) 
    { 
        int M = pat.length(); 
        int N = txt.length(); 
        int i, j; 
        int p = 0; // hash value for pattern 
        int t = 0; // hash value for txt 
        int h = 1 , cnt = 0; 
        int q = 3355439;         
        for (i = 0; i < M-1; i++) 
            h = (h*d)%q; 
        for (i = 0; i < M; i++) 
        { 
            p = (d*p + pat.charAt(i))%q; 
            t = (d*t + txt.charAt(i))%q; 
        } 
        for (i = 0; i <= N - M; i++) 
        {     
            if ( p == t ) 
            {                 
                for (j = 0; j < M; j++) 
                { 
                    if (txt.charAt(i+j) != pat.charAt(j)) 
                        break; 
                }                 
                if (j == M) 
                {//System.out.println("Pattern found at index " + i);
                    cnt++;
                } 
            } 
            if ( i < N-M ) 
            { 
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q; 
                if (t < 0) 
                    t = (t + q); 
            } 
        } 
        return cnt;
    }
    static long gcd(long bigger , long smaller)
    {
            if (smaller == 0) 
                return bigger; 
            return gcd(smaller, bigger % smaller); 
    }
    static long lcm(long a, long b) 
    { 
        return (a*b)/gcd(a, b); 
    } 
    static long sumOfArray(long arr[])
    {
        long sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
            sum += arr[i];
        return sum;
    }
    static boolean isPrime(long n) {
        if(n == 2)
            return true;
        else if(n == 1)
            return false;
        else if (n%2==0)
            return false;          
        for(long i=3;i<=Math.sqrt(n);i+=2) { 
            if(n%i==0) 
                return false; 
        } 
        return true; 
    }
    static long countDigit(long n) 
    { 
        return (long)Math.floor(Math.log10(n) + 1); 
    }
    static long sumOfDigits(long n) 
    { 
        long sum;        
        for (sum = 0; n > 0; sum += n % 10,n /= 10);   
        return sum; 
    }        
    static boolean isPalindrome(String str) 
    {   
        int i = 0, j = str.length() - 1; 
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        } 
        return true; 
    }      
    public static void main(String args[])
    {
        try{
            FastReader sc = new FastReader();
            int T = 1;//sc.nextInt();
            while(T-- > 0)
            {
                int H = sc.nextInt();
                int W = sc.nextInt();
                int Ch = sc.nextInt();
                int Cw = sc.nextInt();
                int Dh = sc.nextInt();
                int Dw = sc.nextInt();
                char ch[][] = new char[H][W];
                for(int i = 0 ; i < H ; i++){
                    //for(int j = 0 ; j < W ; j++)                        
                        ch[i] = sc.next().toCharArray();
                }
                out.write(checkMin(ch , H , W , Ch , Cw , Dh , Dw) + "\n");
            }
            try{
                out.flush();
            }catch(Exception e){
                System.out.print(e);
            };
        }
        catch(Exception e){
            System.out.print(e);
        }
    } 
    static int dx[] = {0 , 0 , 1 , -1};
    static int dy[] = {1 , -1 , 0 , 0};
    static int[] warpH = {1,1,-1,-1,0,1,2,2,2,2,2,1,0,-1,-2,-2,-2,-2,-2,-1};
    static int[] warpW = {1,-1,1,-1,2,2,2,1,0,-1,-2,-2,-2,-2,-2,-1,0,1,2,2};

    public static long checkMin(char str[][] , int H , int W , int Ch , int Cw , int Dh , int Dw)
    {       
        Deque<Cell> dq = new LinkedList<>();
        dq.addFirst(new Cell(Ch-1 , Cw-1 , 0));
        Boolean isVisited[][] = new Boolean[H][W];
        while(dq.size() > 0)
        {
            Cell cell = dq.removeFirst();
            int X = cell.X , Y = cell.Y , ans = cell.dis;
            if(X == Dh-1 && Y == Dw-1){
                return ans;
            }
            if(isVisited[X][Y] != null)
                continue;
            isVisited[X][Y] = true;
            for(int i = 0 ; i <= 3 ; i++){
                int Xx = X + dx[i] , Yy = Y + dy[i];
                if(isValid(Xx , Yy , H , W) && str[Xx][Yy]=='.')
                    dq.addFirst(new Cell(Xx , Yy , ans));
            }
            for(int i = 0 ; i < warpH.length ; i++){                
                int Xx = X + warpH[i] , Yy = Y + warpW[i];
                if(isValid(Xx , Yy , H , W) && str[Xx][Yy]=='.')
                    dq.addLast(new Cell(Xx , Yy , ans+1));                                
            }
        }
        return -1;
    }
}