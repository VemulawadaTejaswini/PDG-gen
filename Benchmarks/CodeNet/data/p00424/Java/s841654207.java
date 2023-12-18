import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	HashMap<String,String> c = new HashMap<String,String>();
    	
    	while(true){
			try {
				int tn = Integer.parseInt(in.readLine());
			
				if(tn == 0){
					break;
				}
    			    
    			for(int i=0; i < tn; i++){
    				String[] tableLine = in.readLine().split(" ");
    				c.put(tableLine[0],tableLine[1]);
    			}
	    		
    			int wn = Integer.parseInt(in.readLine());
    			StringBuilder answer = new StringBuilder(); 
   
    			for(int i=0; i < wn; i++){
    				String word = in.readLine();
    				if(c.containsKey(word)){
    					answer.append(c.get(word));
    				}else{
    					answer.append(word);
    				}
    			}
    			System.out.println(answer.toString());
    			
			}catch (IOException e) {
				e.printStackTrace();
			}	
    	}
    }
}