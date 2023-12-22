import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String boxstr[] = new String[4];
        int ans = 0;
        
        for(int i = 0;i<4;i++){
        	
            boxstr[i] = String.valueOf(line.charAt(i));
            
            if(boxstr[i].equals("+")){
            	ans ++;
            }else{
            	ans --;
            }
        	
        }
        
        System.out.println(ans);
        
        
	}
}