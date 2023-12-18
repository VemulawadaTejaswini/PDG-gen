import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int n=0;
            double sum=0;
            while ((line = br.readLine()) != null) {
            	if(line.equals("0"))break;
            	n=Integer.parseInt(line);
            	sum=0;
            	String[] str=br.readLine().split(" ");
            	for(int i=0;i<str.length;i++){
            		sum+=Double.parseDouble(str[i]);
            	}
            	double result=0,ave=sum/n;
            	for(int i=0;i<str.length;i++){
            		result+=Math.pow(Double.parseDouble(str[i])-ave,2);
            	}
            	System.out.println(Math.sqrt(result/n));
            }
        }
    }


}