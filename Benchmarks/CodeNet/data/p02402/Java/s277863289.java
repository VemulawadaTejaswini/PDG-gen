import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str2[] = br.readLine().split(" ");
        long sum = 0;
        int tmp = 0;
        int max = -1000000;
        int min = 1000000;
        for(int i = 0; i < n; i++){
            tmp = Integer.parseInt(str2[i]);
            if(tmp > max) max = tmp;
            if(tmp < min) min = tmp;
            sum += tmp;
        }
        System.out.println(min+" "+max+" "+sum);
    }
}