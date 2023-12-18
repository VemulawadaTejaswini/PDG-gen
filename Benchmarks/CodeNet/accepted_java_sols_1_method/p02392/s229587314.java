import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
            	int a=Integer.parseInt(str[0]);
            	int b=Integer.parseInt(str[1]);
            	int c=Integer.parseInt(str[2]);
            	if(a<b&&b<c){
            		System.out.println("Yes");
            	}else{
            		System.out.println("No");
            	}
            	
            	break;
            }
        }
    }
}