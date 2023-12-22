import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
 
        while(!(str=br.readLine()).equals("0")){
            int n = Integer.parseInt(str);
            long score=0;
            long max = Long.MIN_VALUE;
 
            for(int i=0; i<n; i++){
                int a =Integer.parseInt(br.readLine());
                score = Math.max(score+a, a);
                max = Math.max(score, max);
            }
            System.out.println(max);
        }
    }
}