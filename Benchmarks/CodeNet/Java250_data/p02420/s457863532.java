import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String line = br.readLine();
            if(line.equals("-")){
                list.add(sb.toString());
                break;
            }
            if(!isNumber(line)){
                list.add(sb.toString());
                sb = new StringBuilder(line);
                String foo = br.readLine();//消化
                continue;
            }
            int sub = Integer.parseInt(line);
            String tmp = sb.substring(0,sub);
            sb = sb.delete(0,sub);
            sb.append(tmp);
        }
        list.remove(0);
        for(String s:list) 
            System.out.println(s);
    }
    static boolean isNumber(String val) {
    	try {
    		Integer.parseInt(val);
    		return true;
    	} catch (NumberFormatException nfex) {
    		return false;
    	}
    }
}