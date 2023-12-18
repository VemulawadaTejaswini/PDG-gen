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
        	
        	while(c!=n) {
        		int sc=0;
        		for(int j=0;j<data.size();j++) {
        			if(i%data.get(j)!=0)sc++;
        		}
        		
        		if(sc==data.size()) {
        			data.add(i);
        			c++;
        		}
        		i++;
        	}
        	
        	
        	i=data.get(data.size()-1);
        	while(true) {
        		boolean jd=false;
        		for(int j=0;j<data.size();j++) {
        			if(i%data.get(j)==0) {
        				jd=true;
        				break;
        			}
        		}
        		
        		if(jd)i++;
        		else {
        			System.out.println(i);
        			break;
        		}
        	}
        	
        }
        
    }
}
