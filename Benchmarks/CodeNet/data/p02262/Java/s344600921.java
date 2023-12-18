import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        str = br.readLine();
        int n = Integer.parseInt(str);

        int[] A = new int[n];
        for(int i=0;i<n;i++){
            str = br.readLine();
            A[i] = Integer.parseInt(str);
        }

        int[] m = {0}; //in order to use m by reference                   
        int[] cnt = {0};//in order to use cnt by reference
        int[] G = shellSort(A,n,m,cnt);

        System.out.println(m[0]);
        StringBuilder sb = new StringBuilder();
        for(int i = G.length - 1; i >= 0; i--){
            if(G[i] > 0 ){
            sb.append(G[i]);
            sb.append(" ");
            }
        }
        System.out.println(sb.toString());
        System.out.println(cnt[0]);
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }

       
        
        br.close();
    }
   
    public static void insertionSort(int[]A,int n,int g,int[] cnt){
        for(int i = g ;i < n ;i++){
            int v = A[i];
            int j = i- g;// 0 to n-g
            while(j >=0 && A[j] > v ){
                A[j+g] = A[j]; //A[i] = A[j];
                j = j -g;
                cnt[0] +=1;
            }
            A[j+g] = v;//original A[j] = v
        }
    }

    public static int[] shellSort(int[]A,int n,int[] m,int[] cnt){
        int[] G = new int[33];
        for(int i =1; i < n ;i = 3 * i +1){
            G[m[0]] = i;
            m[0] +=1;
        }
        for(int i= m[0] - 1 ;i>=0 ;i--){
            insertionSort(A,n,G[i],cnt);
        }

        return G;
    }
}

