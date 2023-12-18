import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	HashMap<String,String> cTable = new HashMap<String,String>();
    	String answer = "";
    	
    	while(true){
    		try {
    			int tableNum = Integer.parseInt(in.readLine());
    			
    			if(tableNum != 0){
    			    //変換テーブルの読み込み
    				for(int i=0; i < tableNum; i++){
    					String[] tableLine = in.readLine().split(" ");
    					cTable.put(tableLine[0],tableLine[1]);
    				}
	    		
    				int wordNum = Integer.parseInt(in.readLine());
    				String word = "";
    				//変換したい文字列の読み込み
    				for(int i=0; i < wordNum; i++){
    					word = word + in.readLine(); 
    				}
    			    
    				char[] wordLine = word.toCharArray();
    			    answer = answer + dataConversion(cTable, wordLine);
    			    
    			}else{
    				System.out.println(answer);
    				in.close();
    				break;
    			}
    			
    			
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
    		
    	}
    }
    
    public static String dataConversion(HashMap<String,String> c, char[] w){
    	String answer = "";
    	for(int i=0; i < w.length; i++){
    		String key = String.valueOf(w[i]);
    		if(c.containsKey(key)){
    			answer = answer + c.get(key);
    		}else{
    			answer = answer + key;
    		}
    	}
        return answer + "\n";
    }
}