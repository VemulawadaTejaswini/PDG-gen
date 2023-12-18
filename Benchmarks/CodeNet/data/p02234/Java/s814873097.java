import java.util.*;
import java.io.*;

public class Main{
    static int maxVal=Integer.MAX_VALUE;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        //M[i][j]:i番目からj番目まで(両端含む)の最小積算回数を格納
        int[][] M = new int[n+1][n+1];

        //p[i]:i番目の行列の行数を格納
        int p[] = new int [n+1];
        int q[] = new int [n+1]; //列数

        for (int i=1;i<=n;i++){
            String[] sArr=sc.nextLine().split(" ");
            int a = Integer.parseInt(sArr[0]);
            int b = Integer.parseInt(sArr[1]);

            p[i-1]=a;
            p[i]=b;
            q[i]=b;
        }
        
        for(int i=1;i<=n;i++){M[i][i]=0;}
        
        // k:行列の数 j:始点 l:区切り点
            for(int k=2;k<=n;k++){
                for(int j=1;j<=n-k+1;j++){
                        //M[j][k]=Math.min(M[j+1][k]+p[j]*p[k]*q[k],M[j][k-1]+p[j]*p[k]*q[k]);
                        M[j][j+k-1]=maxVal;
                        for(int l=j;l<j+k-1;l++){
                            M[j][j+k-1]=Math.min(M[j][l]+M[l+1][j+k-1]+p[j-1]*p[l]*p[j+k-1],M[j][j+k-1]);
                        }
                }
            }
            
        System.out.println(M[1][n]);


       

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //    try{
        //         //int n= Integer.parseInt(br.readLine());
        //         //int[] array = Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();

                
                
        //     }catch(IOException e){e.printStackTrace();}
    }
}
    
