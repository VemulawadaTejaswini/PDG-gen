import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int n = Integer.parseInt(br.readLine());
        for(int x = 1 ; x <= n; x++){
        	if(x % 3 == 0){
        		System.out.print(" " + x);
        	}else {
        		Integer m = new Integer(x);
        		String k = m.toString();
        		for(int y = 0; y < k.length(); y++){
        			String str = String.valueOf(k.charAt(y));
        			if(str.equals ("3")){
        				System.out.print(" " + x);
        				break;
        			}
        		}
        	}
        }
        System.out.println();
    }
}