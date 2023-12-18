import java.io.*;
import java.util.*;


//I have to use hashset
public class Main{
    static int count =0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
        str = br.readLine();
        int n = Integer.parseInt(str);

        str=br.readLine();
        String[] temp = str.split("\\s");
        
        int[] A = new int[n];
        int[] B = new int[n];
        int k =0;
        for(int i= 0;i<n;i++){
            A[i] = Integer.parseInt(temp[i]);
            if(k<A[i]){
                k =A[i];
            }
            //System.out.print(A[i]);
        }

        k+=2;
        int[] ans = solv(A,B,k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
        
    }

    public static int[] solv(int[] A,int[] B,int k){//k equal Max value of A or more
        int[] C = new int[k];

        for(int j=0;j<A.length;j++){
            C[A[j]]++;//Aの要素の出現回数が記録される
        }

        for(int i=1;i<k;i++){
            C[i] += C[i-1];
        }

        for(int j= A.length-1;j>=0;j--){
            B[C[A[j]]-1] = A[j];
            C[A[j]]--;//ダブってるときはマイナスする
        }

        return B;
    }
     
}
