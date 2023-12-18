
import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),cnt=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)arr[i]=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]!=arr[j]&&arr[j]!=arr[k]&&arr[i]!=arr[k]){
                        if(arr[i]+arr[j]>arr[k] && arr[i]+arr[k]>arr[j] && arr[j]+arr[k]>arr[i] )cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);

    }

}




class Scanner
{
    StringTokenizer st;
    BufferedReader br;

    public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

    public String next() throws IOException
    {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public int nextInt() throws IOException {return Integer.parseInt(next());}

    public long nextLong() throws IOException {return Long.parseLong(next());}

    public String nextLine() throws IOException {return br.readLine();}

    public double nextDouble() throws IOException
    {
        String x = next();
        StringBuilder sb = new StringBuilder("0");
        double res = 0, f = 1;
        boolean dec = false, neg = false;
        int start = 0;
        if(x.charAt(0) == '-')
        {
            neg = true;
            start++;
        }
        for(int i = start; i < x.length(); i++)
            if(x.charAt(i) == '.')
            {
                res = Long.parseLong(sb.toString());
                sb = new StringBuilder("0");
                dec = true;
            }
            else
            {
                sb.append(x.charAt(i));
                if(dec)
                    f *= 10;
            }
        res += Long.parseLong(sb.toString()) / f;
        return res * (neg?-1:1);
    }

    public boolean ready() throws IOException {return br.ready();}


}