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
        int k =10001;
        for(int i= 0;i<n;i++){
            A[i] = Integer.parseInt(temp[i]);
            //System.out.print(A[i] + " ");
            if(k < A[i]){
                k = A[i];
            }
        }

       solv(A,k);

    }

    public static void solv(int[] A,int k){//k equal Max value of A or more
        int[] B = new int[A.length];
        int[] C = new int[k];
        for(int i=0;i<k;i++){
            C[i]=0;
        }

        for(int j=0;j<A.length;j++){
            C[A[j]]++;//Aの要素の出現回数が記録される
        }

        for(int i=1;i<k;i++){
            C[i] += C[i-1];
        }
        
        //for(int i=0;i<C.length;i++){
        //System.out.println(C[i] + " ");
        //}

        for(int j= A.length-1;j>=0;j--){
            B[C[A[j]]-1] = A[j];
            //System.out.print(A[j] + " " );
            //System.out.print(C[A[j]] + " ");
            C[A[j]]--;
        }

        for(int i=0;i<B.length;i++){
            if(i != B.length -1){
                System.out.print(B[i] + " ");
            }else{
                System.out.println(B[i]);
            }

        }
    }
     
}
