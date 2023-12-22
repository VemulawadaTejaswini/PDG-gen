import java.io.*;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] v = new int[N];
        int[] c = new int[N];
        for(int i=0;i<N;++i)
        {
            v[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;++i)
        {
            c[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        for(int i=0;i<N;++i)
        {
            ans+=v[i]>c[i]?v[i]-c[i]:0;
        }
        bw.write(ans+"");
        bw.close();

    }

}
