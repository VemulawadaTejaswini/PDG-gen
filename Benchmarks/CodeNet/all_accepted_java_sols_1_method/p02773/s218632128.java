import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

  		String[] s=new String[n+1];
		for(int c=0;c<n;c++){
    		s[c]=sc.next();
    	}
  	s[n]="zzzzzzzzzzzzzzzzzzz";
  	  Arrays.sort(s);
  		
  		ArrayList<String> ans=new ArrayList<String>(n);
  		int count=0;
  		int max=0;
  		int k=0;
  		if(s[0].equals(s[1])){
  		ans.add(s[0]);
        }
  		for(int d=0;d<n;d++){
          if(s[d].equals(s[d+1])){
          	count++;
           
          }else{
            
            if(max<count){
             ans.clear();
            ans.add(s[d]);
        
          	max=count;
            
            }else if(max==count){
             ans.add(s[d]);
             max=count;
            
            }
            count=0;
            
          }
        
        }
    
 	for(String a:ans){

    	System.out.println(a);
    }
    }
}