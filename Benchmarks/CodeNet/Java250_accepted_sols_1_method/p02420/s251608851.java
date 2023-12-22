import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line,result="";
            boolean first=true;
            int sum=0,n=0,i=0;
            while ((line = br.readLine()) != null) {
            	if(line.equals("-"))break;
            	if(first){
            		result=line;
            		n=Integer.parseInt(br.readLine());
            		i=0;
            		first=false;
            	}else{
            		int a=Integer.parseInt(line);
            		result=result.substring(a,result.length())+result.substring(0,a);
            		i++;
            		if(i==n){
            			System.out.println(result);
            			first=true;
            		}
            	}
            }
        }
    }


}