import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] in1 = new String[n];
        String[] in2 = new String[n];
        String tmp;
        int minj;
        boolean flg = true;
        
        for(int i=0; i < n; i++){
            in1[i] = sc.next();
            in2[i] = in1[i];
            //System.out.print(in1[i] + " ");
        }

        //BubbleSort
        for(int i = 0; i < n; i++){
            for(int j = n-1; j > i; j--){
                if(in1[j].charAt(1) < in1[j-1].charAt(1)){
                    tmp = in1[j];
                    in1[j] = in1[j-1];
                    in1[j-1] = tmp;
                }
            }
        }
        
        //for(int i = 0; i < n; i++){
          //  System.out.print(in1[i] + " ");
        //}
    
        //selection sort
        for(int i = 0; i < n; i++){
            minj = i;
            for(int j = i; j < n; j++){
                if(in2[j].charAt(1) < in2[minj].charAt(1)){
                    minj = j;
                }
            }
            tmp = in2[i];
            in2[i] = in2[minj];
            in2[minj] = tmp;
        }

        for(int i = 0; i < n; i++){
            if(i < (n-1)){
                System.out.print(in1[i] + " ");
            }else{
                System.out.println(in1[i]);
            }
        }
        System.out.println("Stable");
        
        for(int i = 0; i < n; i++){
            if(i < (n-1)){
                System.out.print(in2[i] + " ");
            }else{
                System.out.println(in2[i]);
            }
        }
        
        for(int i = 0; i < n; i++){
            if(in1[i] != in2[i]){
                flg = false;
            }
        }
        
        if(flg){
            System.out.println("Stable");
        }else{
            System.out.println("Not stable");
        }
   }
}
