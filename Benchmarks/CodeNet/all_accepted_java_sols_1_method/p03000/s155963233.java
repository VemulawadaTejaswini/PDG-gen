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
        int n= sc.nextInt();
        int x = sc.nextInt();
        int ans=1;
        int d=0;
        for(int i=0;i<n;i++){
            d+=sc.nextInt();
            if(d<=x){
                ans++;
            }else{
                break;
            }
        }
        System.out.println(ans);

    }


}