import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        Map<String,String> map=new HashMap<String,String>();
        byte[] asciiCodes1 = new byte[26];
        byte[] asciiCodes2 = new byte[26];
        int j=0;
        for(byte i=0;i<26;i++){
        	asciiCodes1[j]=(byte) ((byte)65+i);
        	asciiCodes2[j]=(byte) ((byte)68+i);
        	j++;
        }
        asciiCodes2[23]=(byte) ((byte)65);
        asciiCodes2[24]=(byte) ((byte)66);
        asciiCodes2[25]=(byte) ((byte)67);
        String resultString2 = new String(asciiCodes1, "US-ASCII");
        String resultString = new String(asciiCodes2, "US-ASCII");
        
        for(int i=0;i<26;i++){
        	map.put(resultString.substring(i, i+1), resultString2.substring(i, i+1));
        }
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line,str="";
            while ((line = br.readLine()) != null) {
            	for(int k=0;k<line.length();k++){
            		str+=map.get(line.substring(k, k+1));
            	}
            	System.out.println(str);
            	break;
            }
            
        }
    }

}