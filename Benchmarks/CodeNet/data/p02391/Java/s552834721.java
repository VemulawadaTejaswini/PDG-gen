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
            	if(Integer.parseInt(str[0])==Integer.parseInt(str[1])){
            		System.out.println("a == b");
            	}else if(Integer.parseInt(str[0])>Integer.parseInt(str[1])){
            		System.out.println("a > b");
            	}else if(Integer.parseInt(str[0])<Integer.parseInt(str[1])){
            		System.out.println("a < b");
            	}
            	/*watch
            	 * int s=Integer.parseInt(line);
            	System.out.println(s/3600+":"+(s/60)%60+":"+s%60);
            	break;*/
            	break;
            }
        }
    }
}