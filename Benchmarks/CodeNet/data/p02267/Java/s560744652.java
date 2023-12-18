import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] S = new int[10001]; //for sentinel                                    
        int[] T = new int[500];
        int n = Integer.parseInt(br.readLine());
        String[] in_S = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            S[i] = Integer.parseInt(in_S[i]);
        }
        int q = Integer.parseInt(br.readLine());
        String[] in_T = br.readLine().split(" ");
        int sum = 0;
        for(int i = 0; i < q; i++){
            T[i] = Integer.parseInt(in_T[i]);
            if( search(S, n, T[i]) ) sum++;
        }
        System.out.println(sum);
    }

    public static boolean search(int[] S, int n, int key){
        int i = 0;
        S[n] = key;
        while(S[i] != key) i++;
        return i != n;
    }

}