import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0;
            while ((line = br.readLine()) != null) {

            	String[] str=line.split(" ");
            	int a=Integer.parseInt(str[0]);
            	int b=Integer.parseInt(str[1]);
            	double x=Integer.parseInt(str[0]);
            	double y=Integer.parseInt(str[1]);
            	String n=String.format("%.5f", (x/y));
            	System.out.println(a/b+" "+a%b+" "+n);
            	
            	break;
            }
        }
    }
}