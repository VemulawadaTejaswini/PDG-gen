import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while(true){
        	int ans = 0;
        	String[] input = br.readLine().split(" "); 
            int a = Integer.parseInt(input[0]);
            String op = input[1]; 
            int b = Integer.parseInt(input[2]);
            if(op.equals ("+")){
            	ans = a + b;
            }else if(op.equals ("-")){
            	ans = a - b;
            }else if(op.equals ("*")){
            	ans = a * b;
            }else if(op.equals ("/")){
            	ans = a / b;
            }else{
            	break;
            }
            System.out.println(ans);
        }
        
    }
}