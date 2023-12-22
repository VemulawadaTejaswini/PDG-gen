import java.util.*;
import java.io.*;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		String str = "";
		
		int alf[];
		char line;
		alf = new int[26];
		
				
		while(as.hasNext()){
			
			str = str + as.nextLine();
			
		}
		
		
		for(int i=0;i<str.length();i++){      //
            
            line = str.charAt(i);
   
        	if(line > '@' && line < '['){

    			alf[line-'A'] += 1;
        		
        	}
        	else if(line > '\u0060' & line < '{'){
        	
        		alf[line-'a'] += 1;
        		
        	}
            	
           
             
        }
		
		line = 'a';
		
		for(int i=0;i<26;i++){
		
			str = (line++) + " : " + alf[i];
			System.out.println(str);
			
		}
		
		
		

	}

}