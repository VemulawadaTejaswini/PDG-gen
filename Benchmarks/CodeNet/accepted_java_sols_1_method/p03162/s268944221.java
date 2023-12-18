import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        int A[]=new int[n];
        int B[]=new int[n];
        int C[]=new int[n];
        int x[]=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        A[0]=x[0];
        B[0]=x[1];
        C[0]=x[2];
        for(int i=1;i<n;i++)
        {
            int abc[]=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            A[i]=Math.max(B[i-1],C[i-1])+abc[0];
            B[i]=Math.max(A[i-1],C[i-1])+abc[1];
            C[i]=Math.max(A[i-1],B[i-1])+abc[2];
        }
        bw.write(Integer.toString(Math.max(A[n-1],Math.max(B[n-1],C[n-1]))));
        br.close();
        bw.close();
    }
}