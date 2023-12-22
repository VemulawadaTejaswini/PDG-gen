import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int sum=0;
            while ((line = br.readLine()) != null) {
            	if(line.equals("0"))break;
            	sum=0;
            	for(int i=0;i<line.length();i++){
            		sum+=Integer.parseInt(line.substring(i, i+1));
            	}
            	System.out.println(sum);
            }
        }
    }

}