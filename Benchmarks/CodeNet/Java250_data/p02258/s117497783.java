import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int n=0,j=0;
            int[] store=null;
            boolean first=true,min_flag=true;
            while ((line = br.readLine()) != null) {
            	if(first){
            		n=Integer.parseInt(line);
            		store=new int[n];
            		first=false;
            	}else{
            		store[j]=Integer.parseInt(line);
            		j++;
            		if(j==n){
            			break;
            		}
            	}           	
            }
            int s=0;
            int result=store[1]-store[0];
            int min=store[0],max=min;
            for(int i=1;i<n;i++){
            	if(min_flag){
            		s=store[i];
           		}
            	//System.out.println(i);
            	min_flag=true;
           		if(s<=min&&i!=n-1){
           			//System.out.println(s);
            		min=s;
	            	if(i==n-2){
	           			max=store[i+1];
	            		if(max-min>result){
	            			System.out.println(max-min);
	            		}else{
	           				System.out.println(result);
	           			}
	           			return;
	           		}else{
	           			s=store[i+1];
	           			max=s;
	           			if(result<max-min){
	           				result=max-min;
	           			}else{
	           				min_flag=false;
	           			}
	           		}
	            }else if(s>=max){
	           		max=s;
	           		if(max-min>result){
	           			result=max-min;
	           		}
	          	}
            		
            }
            	
            System.out.println(result);
        }
    }
}