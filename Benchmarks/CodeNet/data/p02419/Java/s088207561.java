import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
    	   	                                                 
    	String W = reader.readLine();
    	String Tall = "";
    	
    	while(true){
    	String T = reader.readLine();
    	if(T.equals("END_OF_TEXT")){
    		break;
    	}
    	else{
        Tall = Tall + T; 
    	}
    	}
        int sum = 0;
        
        
        String [] item = Tall.split(" ");
        
        
        for(int itemNum = 0; itemNum < (item.length - 1); itemNum++){
            if(item [itemNum].equals(W)){
            sum++;
            }
            else{
            }
        }
        System.out.println(sum);
    }
}