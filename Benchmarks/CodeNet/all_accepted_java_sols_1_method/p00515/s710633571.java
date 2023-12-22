import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0,sum=0;
            
            while ((line = br.readLine()) != null) {
            	int a=Integer.parseInt(line);
            	if(a<40){
            		a=40;
            	}
            	sum+=a;
            	i++;
            	if(i==5){
            		break;
            	}
            }
            System.out.println(sum/5);
        }
    }

}