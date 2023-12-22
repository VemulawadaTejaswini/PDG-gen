import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String str;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[]S = new int[n];
        for(int i=0;i<n;i++){
            S[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] T = new int[q];
        for(int i=0;i<q;i++){
            T[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0;i<q;i++){
            for(int j=0;j<n;j++){
                if(T[i] == S[j]){
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }    
}
