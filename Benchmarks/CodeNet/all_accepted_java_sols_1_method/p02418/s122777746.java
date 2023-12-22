import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            boolean t=false;
            while ((line = br.readLine()) != null) {
            	String line2=br.readLine();
            	line=line+line;
            	for(int i=0;i<line.length()-line2.length();i++){
            		if(line.substring(i, i+line2.length()).equals(line2)){
            			t=true;
            			break;
            		}
            	}
            	
            	System.out.println(t?"Yes":"No");
            	break;
            }
        }
    }
}