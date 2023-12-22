import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int i=0;
		int sum=0;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null ) {
            	sum+=Integer.parseInt(line);
            	i++;
            	if(i==4){
            		break;
            	}
            }
            System.out.println(sum/60);
            System.out.println(sum%60);
		}
	}
}