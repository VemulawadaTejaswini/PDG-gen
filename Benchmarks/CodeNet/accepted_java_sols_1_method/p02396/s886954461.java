import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

    	int i = 1;
    	while(true){
    		int x = Integer.parseInt(br.readLine());
    		 if(x == 0){
    			 break;
    		 }
    		 System.out.println("Case" + " " + i + ":" + " " + x);
    		 i++;
    	}
    }
}