import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		try{
	        InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);
	        String str;
	        String target[];
	        int  checkResult = 99;
	        int caesar;
	        
	        while( (str = br.readLine()) != null){
	        	caesar = 0;
	        	target =  str.split(" ");
		        for(int i = 0; i < target.length; i++){    		
	        		checkResult = checkPattern(target[i]);
	        		if(checkResult != 99){
	        			caesar = checkResult;
	        			break;
	        		}
	        	}
	        
	            StringBuilder result = new StringBuilder();
	            for(int i = 0; i < target.length; i++){
	        	    result.append(makeCaeserString(target[i],caesar));
	        	    result.append(" ");
	            }        
	            System.out.println(result);	        	
	        }	        
		}catch(Exception e){
			System.out.println(e);
		}
	}

	private static int checkPattern(String str){
		
		String target[];
		target = str.split("\\.");
		int result  = 99;
		
		for(int i = 0; i < target.length; i++){
			result = isThe(target[i]);
			if(result != 99) break;
			result = isThis(target[i]);
			if(result != 99) break;
			result = isThat(target[i]);
			if(result != 99) break;
		}
		return result;
	}
	
	private static int isThe(String str){
		
		String newStr;
		String  target = "the";
		int result = 99;
		
		if(str.length() != target.length()) return result;
		
		for(int i = -26; i < 27; i++){
			//str.charAt(j)???str???j????????????????????????
			newStr =  String.valueOf((char)(str.charAt(0)+i))
					 + String.valueOf((char)(str.charAt(1)+i))
				     + String.valueOf((char)(str.charAt(2)+i));
			
			if( newStr.equals(target) ){
				result = i;
				break;
			}
		}
		return result;
	}
	
	private static int isThis(String str){
		
		String newStr;
		String  target = "this";
		int result = 99;
		
		if(str.length() != target.length()) return result;
		
		for(int i = -26; i < 27; i++){
			//str.charAt(j)???str???j????????????????????????
			newStr =  String.valueOf((char)(str.charAt(0)+i))
					 + String.valueOf((char)(str.charAt(1)+i))
				     + String.valueOf((char)(str.charAt(2)+i))
			         + String.valueOf((char)(str.charAt(3)+i));
			
			if( newStr.equals(target) ){
				result = i;
				break;
			}
		}
		return result;
	}	
  private static int isThat(String str){
	
	String newStr;
	String  target = "that";
	int result = 99;
		
	if(str.length() != target.length()) return result;
	
	for(int i = -26; i < 27; i++){
		//str.charAt(j)???str???j????????????????????????
		newStr =  String.valueOf((char)(str.charAt(0)+i))
				 + String.valueOf((char)(str.charAt(1)+i))
			     + String.valueOf((char)(str.charAt(2)+i))
			     + String.valueOf((char)(str.charAt(3)+i));
		
		if( newStr.equals(target) ){
			result = i;
			break;
		}
	}
	return result;
  }
  
  private static String makeCaeserString(String str,int n){
	  
	  int intA = 'a';
	  int intZ = 'z';
	  int zure = 0;
	  String result = "";
	  	  
	  for(int i = 0; i < str.length(); i++){
		  if(str.charAt(i)<intA || str.charAt(i) > intZ){
			  return str;
		  }else if( (str.charAt(i)) == ".".charAt(0)){
			  zure = -n;
		  }else if( str.charAt(i) + n < intA ){
			  zure = 26;
		  }else if(str.charAt(i) + n > intZ){
			  zure = -26;
		  }
		  result += String.valueOf((char)(str.charAt(i)+n+zure));
	      zure = 0;
	  }
	  return result;
  }
}