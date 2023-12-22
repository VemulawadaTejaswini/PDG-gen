import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args)throws Exception{
		
		int i = 1;
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
        	str = br.readLine();
        	if(str.equals("0")){
        		break;
        	}
        	System.out.println("Case " + i + ": " + str);
        	i++;
        }
        
	}
}