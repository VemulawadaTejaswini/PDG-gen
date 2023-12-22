import java.io.*;

public class Main{

	static int first = 0;
	static int second = 0;
	static int third = 0;
	static int tmp = 0;
	
	public static void main(String[] args) {
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         try{
        	 String buf = br.readLine();
        	 for(int i = 0; i <= 9; i++){
               	 tmp = Integer.parseInt(buf);
        	 	 if(first <= tmp){
        	 		 third = second;
        	 		 second = first;
        	 		 first = tmp;
        	 	 }else if(second <= tmp){
        	 		 third = second;
        	 		 second = tmp;
        	 	 }else if(third <= tmp){
        	 		 third = tmp;
        	 	 }
        	 	 buf = br.readLine();
        	 }    	 
         }catch(Exception e){
        	
         }        
         System.out.println(first+"\n"+second+"\n"+third);
	}
	
}