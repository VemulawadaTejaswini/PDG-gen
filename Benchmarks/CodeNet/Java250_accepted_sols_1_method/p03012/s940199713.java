import java.io.*;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int s1=0,s2=0;
        int ans=Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;++i)
        {
            arr[i] = Integer.parseInt(st.nextToken());
            s2+=arr[i];
        }
        for(int i=0;i<N;++i)
        {
            s1+=arr[i];
            s2-=arr[i];
            ans = Math.min(ans, Math.abs(s1-s2));
        }
        bw.write(ans+"");
        bw.close();
    }

}
