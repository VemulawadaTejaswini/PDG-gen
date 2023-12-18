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
        
        int[] A = new int[temp.length];
        for(int i= 0;i<temp.length;i++){
            A[i] = Integer.parseInt(temp[i]);
        }

        int ans = solv(0,A,0);
        System.out.println(ans);
        
    }

    public static int solv(int i,int[]A,int count){
        if(i== A.length){
            return count;
        }else{
            for(int j=0;j<A.length;j++){
                if(i>j){
                    if(A[i] < A[j]){
                        count++;
                    }
                }
            }
            i++;
            return solv(i,A,count);
        }
    }
    
 
     
}
