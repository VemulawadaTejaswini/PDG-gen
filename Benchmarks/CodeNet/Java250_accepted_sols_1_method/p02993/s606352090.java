import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
      
        String s=sc.next();
		int ans=0;
  		String[] a=s.split("");
		for(int c=0;c<3;c++){
    		if(a[c].equals(a[c+1])){
            ans++;
            }
    	}
    
 	if(ans==0){
    		System.out.println("Good");
    	}else{
     		System.out.println("Bad");
   	 }

    	
    }
}
