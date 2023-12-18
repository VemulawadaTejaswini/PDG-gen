import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	HashMap<String,String> cTable = new HashMap<String,String>();
    	ArrayList<String> answer = new ArrayList<String>();
    	
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
    				String[] wordLine = new String[wordNum];
    				//変換したい文字列の読み込み
    				for(int i=0; i < wordNum; i++){
    					wordLine[i] = in.readLine(); 
    				}
    			
    				answer.add(dataConversion(cTable,wordLine));
    				
    			}else{
    			  	for(int i=0; i < answer.size(); i++){
    		    		System.out.println(answer.get(i));
    		    	}
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
    
    public static String dataConversion(HashMap<String,String> c, String[] w){
    	String answer = "";
    	for(int i=0; i < w.length; i++){
    		String key = w[i];
    		if(c.containsKey(key)){
    			answer = answer + c.get(key);
    		}else{
    			answer = answer + key;
    		}
    	}
        return answer;
    }
}