import java.util.Arrays;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] b = new String[N];
        // b[0] = s;
        if(s.length() != 1){
            b = s.split(" ",0);
        }
        // System.out.println(b[0]);
        int[] X = new int[N];
        for(int i = 0;i<N;i++){
            X[i] = Integer.valueOf(b[i]);
        }
        int[] Y = X.clone();
        Arrays.sort(Y);
        for(int i = 0;i<N;i++){
            if(X[i]<Y[Y.length/2]){
                System.out.println(Y[Y.length/2]);
            }else{
                System.out.println(Y[Y.length/2-1]);
            }
        }
    }
}