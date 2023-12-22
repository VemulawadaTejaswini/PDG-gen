import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

       String[] input = br.readLine().split(" ");
       int a = Integer.parseInt(input[0]);
       int b = Integer.parseInt(input[1]);
       int c = Integer.parseInt(input[2]);
       int cum = 0;
       for(int x = a; x <= b ; x++){
    	   int ans = c % x;
    	   if(ans == 0){
    		   cum += 1;
    	   }
       }
       System.out.println(cum);
    }
}