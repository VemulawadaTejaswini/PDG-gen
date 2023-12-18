import java.io.*;  

public class Watch01 {
    public static void main(String[] args) throws IOException {
	int hour;                                         
	int min;                                          
	int sec;                                          
    	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf = br.readLine();
    String[] x = buf.split(" ",0);
    	
    	int y = Integer.parseInt(x[0]);
    	//int z = Integer.parseInt(x[1]);
        //int i = Integer.parseInt(x[2]);
    	 //System.out.println(x[0] + ":" + x[1] + ":" + x[2]);
    	 
    	 hour = y /3600;
    	 min = (y%3600)/60;
    	 sec = (y%3600)%60;
    	 System.out.println(hour + ":" + min + ":" + sec); 
    	
	    
    }
    