import java.util.*;
import java.io.*;


public class Main{

    static int INFTY = Integer.MAX_VALUE;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
            
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] arr = new int[N+1];
        int minAbs=INFTY;
        int minNum=0;
        int ans=0;
        for(int i=1;i<=N;i++){
            arr[i]=L+i-1;
            ans+=arr[i];
            if(minAbs>Math.abs(arr[i])){
                minAbs=Math.abs(arr[i]);
                minNum=i;
            }
        }
        ans=ans-arr[minNum];
        System.out.println(ans);

    }


}