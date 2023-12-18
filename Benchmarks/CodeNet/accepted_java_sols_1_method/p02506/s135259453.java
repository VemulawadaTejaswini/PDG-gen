import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String W;
		String T;
		String str;
        ArrayList<String> list = new ArrayList<String>();
        int count = 0;
        
        str = br.readLine();
        W = str.toLowerCase();
        
        while(true){
        	T = br.readLine();
        	if(T.equals("END_OF_TEXT")){
        		break;
        	}
        	
        	String strArray[] = T.split(" ");
        	for(int i=0; i<strArray.length; i++){
        		list.add(strArray[i].toLowerCase());
        	}
        	
        }
        
        for(int i=0;i<list.size(); i++){
        	if(W.equals(list.get(i))){
        		count++;
        	}
        }
        
        System.out.println(count);
	}
}