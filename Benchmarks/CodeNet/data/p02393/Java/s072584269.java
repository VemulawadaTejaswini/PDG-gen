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
            	int max=Integer.max(Integer.max(a,b), c);
            	int min=Integer.min(Integer.min(a,b), c);
            	int mid=0;
            	
            	if(max==a||min==a){
            		if(max==b||min==b){
            			mid=c;
                	}else{
                		mid=b;
                	}
            	}
            	if(max==b||min==b){
            		if(max==a||min==a){
            			mid=c;
                	}else{
                		mid=a;
                	}
            	}
            	System.out.println(min+" "+mid+" "+max);
            	break;
            }
        }
    }
}