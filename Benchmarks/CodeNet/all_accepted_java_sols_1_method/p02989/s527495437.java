import java.util.*;
import java.io.*;



public class Main{
    static int INFTY=Integer.MAX_VALUE;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
            
        int n=sc.nextInt();
        int[] arr = new int[n];
        int ans =0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);
        if(arr[n/2-1]==arr[n/2]){
            ans=0;
        }else{
            ans=arr[n/2]-arr[n/2-1];
        }
        System.out.println(ans);
    }
}