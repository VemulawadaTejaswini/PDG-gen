import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
		
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int result=0;
            
            while ((line = br.readLine()) != null) {
            	if(line.equals("=")){
            		break;
            	}else if(first){
            		result=Integer.parseInt(line);
            		first=false;
            	}else{
            		if(line.equals("+")){
            			result+=Integer.parseInt(br.readLine());
            		}else if(line.equals("-")){
            			result-=Integer.parseInt(br.readLine());
            		}else if(line.equals("/")){
            			result/=Integer.parseInt(br.readLine());
            		}else if(line.equals("*")){
            			result*=Integer.parseInt(br.readLine());
            		}
            	}
            	
            }
            System.out.println(result);
        }
    }

}