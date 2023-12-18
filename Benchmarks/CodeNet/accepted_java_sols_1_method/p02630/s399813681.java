import java.util.*;
class Main{
  public static void main(String[] args){
Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    long sum=0;
      Long f=new Long(1);
		    Map<Integer,Long> m=new HashMap<>();
		    for(int i=0;i<n;i++){
		    		int c=sc.nextInt();
		    		sum+=c;
            
		    		if(!m.containsKey(c)) {
		    			m.put(c,f);
		    		}else {
		    			m.put(c,m.get(c)+f);
		    		}
		    }int k=sc.nextInt();
		    for(int i=0;i<k;i++) {
		    	 int prev=sc.nextInt();
				    int fill=sc.nextInt();
				    if(m.containsKey(prev)) {
				    long g=m.get(prev);
				    sum=sum-prev*g;
				    sum=sum+fill*g;
				  				    m.remove(prev);
				    
				    if(!m.containsKey(fill)) {
		    			m.put(fill,g);
		    		}else {
		    			m.put(fill,m.get(fill)+g);
		    		}
				    
                    }
				    System.out.println(sum);
		    }
		    
		   
		 

  }
    
  }
