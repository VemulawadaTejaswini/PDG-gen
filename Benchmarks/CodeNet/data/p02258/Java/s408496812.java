import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int n=0,result=-10000000;
            int[] store=null;
            boolean min_flag=false;
            while ((line = br.readLine()) != null) {
            	n=Integer.parseInt(line);
            	store=new int[n];
            	int min=Integer.parseInt(br.readLine()),max=min;
            	for(int i=1;i<n;i++){
            		int s=Integer.parseInt(br.readLine());
            		
            		if(s<=min&&i!=n-1){
            			min=s;
	            		if(i==n-2){
	            			max=Integer.parseInt(br.readLine());
	            			if(max-min>result){
	            				System.out.println(max-min);
	            			}else{
	           					System.out.println(result);
	            			}
	            			return;
	            		}else{
	            			max=Integer.parseInt(br.readLine());
	            			if(result<max-min){
	            				result=max-min;
	            			}
	            			i++;
	            		}
	            	}else if(s>=max){
	           			max=s;
	            		if(max-min>result){
	            			result=max-min;
	            		}
	           		}
            		
            	}
            	
            	System.out.println(result);
            	break;
            }
        }
    }

}