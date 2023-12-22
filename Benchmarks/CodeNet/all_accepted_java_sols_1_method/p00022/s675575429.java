import java.io.BufferedReader;   
import java.io.InputStreamReader;     
public class Main {   
    public static void main(String args[]) throws Exception {   
        final BufferedReader br = new BufferedReader   
                                 (new InputStreamReader(System.in));   
  
        while(true) {   
            final int n = Integer.parseInt(br.readLine());   
            if(n == 0)   
                break;   
  
            final int[] inputs = new int[n];   
            for(int i = 0; i < inputs.length; i++)   
                inputs[i] = Integer.parseInt(br.readLine());   
  
            int max = Integer.MIN_VALUE;   
            int sum;   
  
            for(int i = 0; i < inputs.length; i++) {   
                sum = 0;   
  
                for(int j = i; j < inputs.length; j++) {   
                    sum += inputs[j];   
                    max = Math.max(sum, max);   
                }   
            }   
  
            System.out.println(max);   
        }   
    }   
} 