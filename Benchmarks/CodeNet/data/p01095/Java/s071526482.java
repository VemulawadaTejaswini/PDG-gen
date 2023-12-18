import java.util.*;
 
class Main {
	
    public static void main(String[] args) {
         
        Scanner cin=new Scanner(System.in);
        while(true) {
        	
        	int m=cin.nextInt(),n=cin.nextInt();
        	if(n==0)break;
        	
        	List<Integer> data=new ArrayList<>();
        	data.add(m);
        	int c=1,i=m+1;
        	
        	while(c!=n+1) {
        		boolean jd=true;
        		for(int j=0;j<data.size();j++) {
        			if(data.get(j)>i/2)break;
        			else if(i%data.get(j)==0) {
        				jd=false;
        				break;
        			}
        		}
        		
        		if(jd) {
        			data.add(i);
        			//System.out.println(i+"=newTAKE");
        			c++;
        		}
        		i++;
        	}
        	
        	System.out.println(data.get(data.size()-1));
        	
        	
        }
        
    }
}
