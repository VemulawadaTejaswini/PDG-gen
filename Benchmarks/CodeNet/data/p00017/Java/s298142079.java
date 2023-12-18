import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		try{
	        InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);
	        String str;
	        String target[];
	        int  tmp1 = 99;
	        int  tmp2 = 99;
	        int  tmp3 = 99;
	        int caesar;
	        
	        while( (str = br.readLine()) != null){
	        	caesar = 0;
	        	target =  str.split(" ");
	        	for(int i = 0; i < target.length; i++){
	        		tmp1 = isThe(target[i]);
	        		tmp2 = isThis(target[i]);
	        		tmp3 = isThat(target[i]);
	        		if( tmp1 != 99){
	        			caesar = tmp1;
	        			break;
	        		}else if( tmp2 != 99){
	        			caesar = tmp2;
	        			break;
	        		}else if( tmp3 != 99){
	        			caesar = tmp3;
	        			break;
	        		}
	        	}
	        
	            StringBuilder result = new StringBuilder();
	            for(int i = 0; i < target.length; i++){
	        	    result.append(caeserString(target[i],caesar));
	        	    result.append(" ");
	            }        
	            System.out.println(result);	        	
	        }	        
		}catch(Exception e){
			System.out.println(e);
		}
	}

	private static int isThe(String str){
		
		String newStr;
		String  target = "the";
		int result = 99;;
		
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
		int result = 99;;
		
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
	int result = 99;;
	
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
  
  private static String caeserString(String str,int n){
	  
	  int intA = 'a';
	  int intZ = 'z';
	  int zure = 0;
	  String result = "";
	  	  
	  for(int i = 0; i < str.length(); i++){
		  if( (str.charAt(i)) == ".".charAt(0)){
			  //result += String.valueOf((char)(str.charAt(i)));
			  //continue;
			  zure = -n;
		  }else if( str.charAt(i) + n < intA ){
			  //result += String.valueOf((char)(str.charAt(i))
			  zure = 26;
		  }else if(str.charAt(i) + n > intZ){
			  zure = -26;
		  }
		  
		  result += String.valueOf((char)(str.charAt(i)+n+zure));
	  }
      zure = 0;
	  return result;
  }
}