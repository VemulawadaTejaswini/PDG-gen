import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0,pas=0,jui=0;
            
            while ((line = br.readLine()) != null) {
            	if(i<3){
            		if(pas==0){
            			pas=Integer.parseInt(line);
            		}else{
            			pas=Integer.min(Integer.parseInt(line), pas);
            		}
            	}else{
            		if(jui==0){
            			jui=Integer.parseInt(line);
            		}else{
            			jui=Integer.min(Integer.parseInt(line), jui);
            		}
            	}
            	i++;
            	if(i==5){
            		break;
            	}
            }
            System.out.println(pas+jui-50);
        }
    }

}