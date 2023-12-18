import java.util.*;
//import java.io.*;
import java.util.stream.IntStream;

public class Main{
    static int minR = Integer.MAX_VALUE;
    static int maxL = 0;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        char[][] arr = new char[h][w];
        int[][] L = new int[h][w];
        int[][] R = new int[h][w];
        int[][] U = new int[h][w];
        int[][] D = new int[h][w];

        IntStream.range(0,h).forEach(i->{
            String line = sc.nextLine();
            for(int j=0;j<w;j++){
                arr[i][j]=line.charAt(j);
            }
        });

        //L
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(arr[i][j]=='#'){
                    L[i][j]=0;
                }else{
                    if(j==0){
                        L[i][j]=1;
                    }else{
                        L[i][j]=L[i][j-1]+1;
                    }
                }

            }
        }

        //R
        for(int i=0;i<h;i++){
            for(int j=w-1;j>=0;j--){
                if(arr[i][j]=='#'){
                    R[i][j]=0;
                }else{
                    if(j==w-1){
                        R[i][j]=1;
                    }else{
                        R[i][j]=R[i][j+1]+1;
                    }
                }

            }
        }

                //U
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(arr[i][j]=='#'){
                    R[i][j]=0;
                }else{
                    if(i==0){
                        U[i][j]=1;
                    }else{
                        U[i][j]=U[i-1][j]+1;
                    }
                }

            }
        }

                //D
                for(int i=h-1;i>=0;i--){
                    for(int j=0;j<w;j++){
                        if(arr[i][j]=='#'){
                            D[i][j]=0;
                        }else{
                            if(i==h-1){
                                D[i][j]=1;
                            }else{
                                D[i][j]=D[i+1][j]+1;
                            }
                        }
        
                    }
                }

        
        
        int ans=0;

        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                    int candidate = L[i][j]+R[i][j]+U[i][j]+D[i][j]-3;
                ans = Math.max(ans,candidate);
            }
        }

        System.out.println(ans);

    }
}