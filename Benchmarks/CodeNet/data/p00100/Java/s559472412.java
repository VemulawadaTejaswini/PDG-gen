import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
 
class Main {
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
    	ArrayList<String> seller = new ArrayList<String>();
    	HashMap<String,Integer> sales = new HashMap<String,Integer>();
    	for(int i=0;i<num;i++){
    		String[] lines = in.readLine().split(" ");
    		if(sales.containsKey(lines[0])){
    			sales.put(lines[0],sales.get(lines[0]) + Integer.parseInt(lines[1])*Integer.parseInt(lines[2]));
    		}else{
    			sales.put(lines[0],Integer.parseInt(lines[1])*Integer.parseInt(lines[2]));
    			seller.add(lines[0]);
    		}
    	}
    	var NA_FLG = true;
    	for(String code:seller){
    		if(sales.get(code) >= 1000000){
    			System.out.println(code);
    			NA_FLG = false;
    		}
    	}
    	if(NA_FLG){
    		System.out.println("NA");
    	}
    }
}