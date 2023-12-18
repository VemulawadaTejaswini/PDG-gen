import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            Map<String,Integer> map=new HashMap<String,Integer>();
            byte[] a=new byte[26];
        	String[] str=new String[26];
        	String resultString;
        	for(int i=0;i<a.length;i++){
        		a[i]=(byte) (i+97);
        		resultString = new String(a, "US-ASCII");
        		map.put(resultString.substring(i, i+1),0);
        		str[i]=resultString.substring(i, i+1);
        	}
            while ((line = br.readLine()) != null&&line.length()!=0) {
            	String s=line.toLowerCase();
            	for(int i=0;i<s.length();i++){
            		if(map.containsKey(s.substring(i, i+1))){
            			map.put(s.substring(i, i+1), 1+map.get(s.substring(i, i+1)));
            		}
            	}
            	
            }
            for(int i=0;i<str.length;i++){
        		System.out.println(str[i]+" : "+map.get(str[i]));
        	}
        }
    }

}