import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int nk[]=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int A[]=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n=nk[0];
        int cost[]=new int[n];
        cost[0]=0;
        cost[1]=cost[0]+Math.abs(A[1]-A[0]);
        for(int i=2;i<n;i++)
        {
            cost[i]=Integer.MAX_VALUE;
            for(int j=1;j<=nk[1];j++)
            {
                if(i-j<0)
                break;
                cost[i]=Math.min(cost[i],cost[i-j]+Math.abs(A[i]-A[i-j]));
            }
        }
        bw.write(Integer.toString(cost[n-1]));
        br.close();
        bw.close();
    }
}