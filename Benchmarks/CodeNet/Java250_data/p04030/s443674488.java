import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	String S = sc.next();
      	String spt[] =S.split("");
      	String ans="";
      	for(int i=0;i<spt.length;i++){
      	    if(spt[i].equals("0")){
      	        ans+="0";
      	    }else if(spt[i].equals("1")){
      	        ans+="1";
      	    }else if(spt[i].equals("B")){
      	        if(!(ans.isEmpty())){
      	            ans =ans.substring(0, ans.length()-1);
      	        }
      	        
      	    }
      	}
      	
      System.out.println(ans);
    }
}
