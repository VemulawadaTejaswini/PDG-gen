import java.util.*;
import java.io.*;

public class Main{
    static int maxVal=Integer.MAX_VALUE;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        
        int ans[][]=new int[n+1][n+1]; 

       for(int i=1;i<=n;i++){
            int u=sc.nextInt();
            int k = sc.nextInt();
            for(int j=0;j<k;j++){
                int v=sc.nextInt();
                ans[i][v]=1;
            }
       }

       for(int l=1;l<=n;l++){
           for(int m=1;m<n;m++){
               System.out.print(ans[l][m]+" ");
           }
           System.out.println(ans[l][n]);
       }

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //    try{
        //         //int n= Integer.parseInt(br.readLine());
        //         //int[] array = Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();

                
                
        //     }catch(IOException e){e.printStackTrace();}
    }
}
    
