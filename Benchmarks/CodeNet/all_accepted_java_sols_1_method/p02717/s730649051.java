import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int A=Integer.parseInt(str[0]);
        int B=Integer.parseInt(str[1]);
        int C=Integer.parseInt(str[2]);
        /* int[] f=new int[N+1];
        int[] arr=new int[N];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
        arr[i]=Integer.parseInt(st.nextToken());
        f[arr[i]]++;
        }
        long count=0;
        for(int i=1;i<=N;i++){
        long n=f[i];
        count=count+n*(n-1)/2;
        }
        for(int i=0;i<N;i++){
        int n=arr[i];
        int freq=f[n];
        System.out.println(count+1-freq);*/
        System.out.println(C+" "+A+" "+B);
    }
}
