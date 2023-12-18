import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int N=Integer.parseInt(str[0]);
        int M=Integer.parseInt(str[1]);
        int[] arr=new int[N];
        double sum=0;
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++) sum+=(arr[i]=Integer.parseInt(st.nextToken()));
        Arrays.sort(arr);
        boolean flag=true;
        for(int i=1;i<=M;i++){
            if(4*M*arr[N-i]<sum){
                flag=false;
                break;
            }
        }
        if(flag) System.out.println("Yes");
        else  System.out.println("No");
    }
}