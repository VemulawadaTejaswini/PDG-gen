import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(" ");
                int n = Integer.parseInt(s[0]);
                long x = Long.parseLong(s[1]);
                s = br.readLine().split(" ");
                long[] a = new long[n];
                for(int i=0; i<n; i++){
                    a[i] = Integer.parseInt(s[i]);
                }
                long[][] b = new long[n][];
                for(int i=0; i<n; i++){
                    long[] bi = new long[n];
                    for(int k=0; k<n; k++){
                        if(k==0){
                            bi[0] = a[(i-k>=0)?i-k:i-k+n];
                        }else{
                            bi[k] = Math.min(bi[k-1], a[(i-k>=0)?i-k:i-k+n]);
                        }
                    }
                    b[i] = bi;
                }
                long min = Long.MAX_VALUE;
                for(int k=0; k<n; k++){
                    long sum = 0;
                    for(int i=0; i<n; i++){
                        sum+=b[i][k];
                    }
                    if(min>k*x+sum){
                        min=k*x+sum;
                    }
                }
                System.out.println(min);
            }
        }
    }
}