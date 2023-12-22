import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		String k=sc.next();
        String l=sc.next();
  		String m=l.substring(0,l.length()-1);
    
 	if(k.equals(m)){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }
 
    }
}