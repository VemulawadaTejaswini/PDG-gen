import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final String[] in = br.readLine().split(" ");
        final int[] s = new int[n];
        for(int i = 0; i<n; i++){
            s[i] = Integer.parseInt(in[i]);
        }
        int c = 0;
        br.readLine();
        final String[] t = br.readLine().split(" ");
        for(final String ti:t){
            if(Arrays.binarySearch(s, Integer.parseInt(ti))>=0) c++;
        }
        System.out.println(c);
    }
}