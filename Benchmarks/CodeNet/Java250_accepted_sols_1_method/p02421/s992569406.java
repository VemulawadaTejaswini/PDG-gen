import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line,result="";
            boolean first=true;
            int n=0,i=0,taro=0,hana=0;
            while ((line = br.readLine()) != null) {
            	if(first){
            		n=Integer.parseInt(line);
            		first=false;
            	}else{
            		String[] str=line.split(" ");
            		if(str[0].compareTo(str[1])>0){
            			taro+=3;
            		}else if(str[0].compareTo(str[1])<0){
            			hana+=3;
            		}else{
            			taro+=1;
            			hana+=1;
            		}
            		i++;
            		if(i==n){
            			System.out.println(taro+" "+hana);
            		}
            	}
            	
            }
        }
    }


}