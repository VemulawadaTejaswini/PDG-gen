import java.io.*;  

public class Watch {
    public static void main(String[] args) throws IOException {
	int hour;                                         
	int min;                                          
	int sec;                                          
    	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int y  = Integer.parseInt(br.readLine());
    
    	  hour = y /3600;
    	  min = (y%3600)/60;
    	  sec = (y%3600)%60;
    	System.out.println(hour + ":" + min + ":" + sec); 
    	
	    
    }
    
}