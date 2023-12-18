import java.io.*;

public class Main{
    public static void main(String[] args){
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	try{
	    String str = reader.readLine();
	    String origin = "CODEFESTIVAL2016";
	    int count = 0;
	    
	    for(int i = 0; i < 16; i++){
		if(str.charAt(i) != origin.charAt(i))
		    count++;			      		
	    }

	    System.out.println(count);
	    
	}catch(IOException e){
	    System.out.println(e);
	}	
    }
}
