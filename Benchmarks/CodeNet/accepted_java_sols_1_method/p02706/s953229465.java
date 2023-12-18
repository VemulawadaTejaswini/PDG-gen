
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        long n = Long.parseLong(in[0]);
        int m = Integer.parseInt(in[1]);
        in = br.readLine().split(" ");
        long sum=0;
        for(int i=0;i<m;i++){
            sum+=Long.parseLong(in[i]);
        }
        if(n>=sum) {
            System.out.println(n-sum);
        }else{
            System.out.println(-1);
        }
    }
}
