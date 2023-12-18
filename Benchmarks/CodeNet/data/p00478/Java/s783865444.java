import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int length=0,i=0,sum=0;
            String ring1="";
            boolean first=true;
            
            while ((line = br.readLine()) != null) {
	            if(first){
	            	ring1=line;
	            	length=Integer.parseInt(br.readLine());
	            	first=false;
	            	i=0;
	            }else{
	            	String toring=line+line;
	            	i++;
	            	for(int k=0;k<toring.length()-ring1.length();k++){
	            		if(ring1.equals(toring.substring(k, k+ring1.length()))){
	            			sum++;
	            			break;
	            		}
	            	}
	            	if(i==length){
	            		System.out.println(sum);
	            		break;
	            	}
	            }
            }
        }
    }


}