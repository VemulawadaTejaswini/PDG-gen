import java.util.*;
import java.io.*;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		String s;
		String p;
		String str;
		int j = 0;
		int count = 0;
		int test = 0;
	    char sli[];
	    char pli[];
	    //int count[];
	    
	    s = as.nextLine();
	    p = as.nextLine();
	    
	    s = s+s;
	    
	    sli = new char[s.length()];
	    pli = new char[p.length()];
	    //count = new int[p.length()];
	    
	    for(int i=0;i<s.length();i++){      //?????????????????????????????????????´???????
            
            sli[i] = s.charAt(i);
             
        }
	    
		for(int i=0;i<p.length();i++){      //?????????????????????????????????????´???????
		    
			pli[i] = p.charAt(i);
		     
		}
		
		for(int i=0;i<(s.length()/2);i++){      //?????????????????????????????????????´???????
		    
			for(j=0;j<p.length();j++){
			
				//System.out.println(sli[j+i]+ "=="+ pli[j]);
				if(sli[j+i] == pli[j]){
		        	
					count++;
					//System.out.println(count);
					//System.out.println((s.length())/2);
					//System.out.println(p.length());
		        	
				}
				else{
					
					count = 0;
				
				}
				
				//System.out.println("!");	
				
			}
			
			
			if(count == p.length()){
				
				break;
				
			}
			
			count = 0;
			
			
        }
		
		if(count == p.length()){
			
			str = "Yes";
			System.out.println(str);
			
		}
		else{
			
			str = "No";
			System.out.println(str);
			
		}
	    
	    
	    

	}

}