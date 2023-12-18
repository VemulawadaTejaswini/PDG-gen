import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String boxstr[] = new String[line.length()];
        int box[] = new int[line.length()];
        int answw = Integer.parseInt(line);   //n
        int ans = 0;
        
        for(int i = 0;i<line.length();i++){
        	
            boxstr[i] = String.valueOf(line.charAt(i));
            
            box[i] = Integer.parseInt(boxstr[i]);   //n
            
            ans +=box[i];
            
            
            
        }
        if(answw%ans == 0){
        	System.out.println("Yes");
        	
        }else{
        	System.out.println("No");
        }
        	
        
	}
}
