import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
	    InputStreamReader input = new InputStreamReader (System. in);
	    BufferedReader buffer = new BufferedReader(input);
	    String stringT = buffer.readLine();
	    char[] charT = stringT.toCharArray();
    	String stringP = buffer.readLine();
    	char[] charP = stringP.toCharArray();
    	long processStart = System.currentTimeMillis();



    	for(int x=0; x<stringT.length() - stringP.length() +1 ; x++){
    		StringBuilder compare = new StringBuilder();
    		int same = 0;
	    	for(int i=0; i<stringP.length(); i++){
	    		if(charT[x+i] == charP[i]){
	    			same += 1;
	    		}
	    	}
	    	if(same == stringP.length()){
	    		System.out.println(x);
	    	}



    	}
    	long processEnd = System.currentTimeMillis();
    	//System.out.println("???????????????" + (processEnd - processStart)  + "ms");
	}
}