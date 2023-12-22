import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{
    public static void main(String[] args) throws IOException{
        int n,in,min,max,i;
 
        long sum = 0;
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
        n = Integer.parseInt(br.readLine());
 
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
  
        String[] readLineArray = br.readLine().split(" ");
  
        for (i = 0; i < n; i++){
            in = Integer.parseInt(readLineArray[i]);
            if(in < min) min = in;
            if(in > max) max = in;
            sum += in;
        }
 
        System.out.println(min+" "+max+" "+sum);
    }
}