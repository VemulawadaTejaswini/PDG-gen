import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0;
            while ((line = br.readLine()) != null && line.length()!=0) {
            	String[] tokens=line.split(" ");
            	int sum=Integer.parseInt(tokens[0])+Integer.parseInt(tokens[1]);
            	while(sum>0){
            		sum=sum/10;
            		i++;
            	}
            	System.out.println(i);
            	
            	
            }
            
        }
    }

}