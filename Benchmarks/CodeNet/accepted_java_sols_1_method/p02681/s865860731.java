import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		String k=sc.next();
        String l=sc.next();
		String[] a=k.split("");
  		String[] b=l.split("");
  		int co=0;
  
		for(int c=0;c<k.length();c++){
    		if(!a[c].equals(b[c])){
             co=1;
              break;
            }
    	}
    
 	if(co==1){
    		System.out.println("No");
    	}else{
     		System.out.println("Yes");
   	 }
 
    	System.out.println();
    }
}