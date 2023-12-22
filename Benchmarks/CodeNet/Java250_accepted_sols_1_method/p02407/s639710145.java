import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            String[] x;
            while ((line = br.readLine()) != null) {
            	String[] str=br.readLine().split(" ");
            	
            	x=new String[str.length];

            	for(int i=x.length-1;i>=0;i--){
            		x[i]=str[x.length-1-i];
            	}
            	System.out.println(String.join(" ",x));
            	break;
            }
        }
    }

}